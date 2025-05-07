def solution(progresses, speeds):
    answer = []
    days = 0  # 날짜 세기
    cnt = 0   # 완료된 기능 수

    while progresses:
        # 현재 기능이 완료되었는지 확인
        if progresses[0] + days * speeds[0] >= 100:
            progresses.pop(0)
            speeds.pop(0)
            cnt += 1
        else:
            if cnt > 0:
                answer.append(cnt)
                cnt = 0
            days += 1
    # 마지막에 남아있는 cnt 추가
    if cnt > 0:
        answer.append(cnt)
    return answer
