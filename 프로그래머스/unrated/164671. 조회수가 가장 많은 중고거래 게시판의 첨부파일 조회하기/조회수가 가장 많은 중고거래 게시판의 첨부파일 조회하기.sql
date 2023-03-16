SELECT CONCAT('/home/grep/src/', F.BOARD_ID, '/', F.FILE_ID, F.FILE_NAME, F.FILE_EXT) AS FILE_PATH
FROM USED_GOODS_BOARD AS B JOIN USED_GOODS_FILE AS F ON B.BOARD_ID = F.BOARD_ID
WHERE B.VIEWS = (SELECT MAX(B1.VIEWS) FROM USED_GOODS_BOARD AS B1)
ORDER BY 1 DESC;

