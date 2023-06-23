from datetime import datetime

# 현재 시간을 가져옵니다.
now = datetime.now()

# strftime 함수를 사용하여 날짜를 문자열로 변환합니다.
today = now.strftime("%Y-%m-%d")
print(today)
