SELECT 
    YEAR(SALES_DATE)AS YEAR
    ,MONTH(SALES_DATE)AS MONTH
    ,GENDER
    ,COUNT(DISTINCT(ONLINE.USER_ID))AS USERS

FROM ONLINE_SALE AS ONLINE
JOIN USER_INFO AS USER
ON ONLINE.USER_ID= USER.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY YEAR,MONTH,GENDER ORDER BY YEAR,MONTH,GENDER