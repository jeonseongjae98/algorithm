from math import ceil

def to_minutes(time):
    h, m = map(int, time.split(":"))
    return h * 60 + m

def solution(fees, records):
    import collections
    car_times = collections.defaultdict(list)

    # 1. 기록을 차량 번호별로 정리
    for record in records:
        time, num, io = record.split()
        car_times[num].append((time, io))

    answer = []
    # 2. 차량 번호 정렬
    for car_num in sorted(car_times.keys()):
        times = car_times[car_num]
        total_time = 0
        stack = []

        # 3. IN/OUT 쌍 계산
        for time, io in times:
            if io == "IN":
                stack.append(to_minutes(time))
            else:  # OUT
                in_time = stack.pop()
                out_time = to_minutes(time)
                total_time += out_time - in_time

        # 4. 만약 출차 기록이 없는 경우 23:59 출차로 간주
        if stack:
            in_time = stack.pop()
            out_time = to_minutes("23:59")
            total_time += out_time - in_time

        # 5. 요금 계산
        base_time, base_fee, unit_time, unit_fee = fees
        if total_time <= base_time:
            fee = base_fee
        else:
            fee = base_fee + ceil((total_time - base_time) / unit_time) * unit_fee
        answer.append(fee)

    return answer
