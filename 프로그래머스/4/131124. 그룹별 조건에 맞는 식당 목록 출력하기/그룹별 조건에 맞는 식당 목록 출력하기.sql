SELECT MP.MEMBER_NAME, RR.REVIEW_TEXT, DATE_FORMAT(RR.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE AS MP JOIN REST_REVIEW AS RR
ON MP.MEMBER_ID = RR.MEMBER_ID
WHERE RR.MEMBER_ID = (SELECT MEMBER_ID FROM REST_REVIEW GROUP BY MEMBER_ID ORDER BY COUNT(REVIEW_SCORE) DESC LIMIT 1)
ORDER BY 3 ASC, 2 ASC;