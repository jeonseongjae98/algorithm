SELECT DISTINCT CRCC.CAR_ID AS CAR_ID
FROM CAR_RENTAL_COMPANY_CAR AS CRCC JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS CRCRH
ON CRCC.CAR_ID = CRCRH.CAR_ID
WHERE CRCC.CAR_TYPE = '세단' AND MONTH(START_DATE) = 10
ORDER BY 1 DESC;