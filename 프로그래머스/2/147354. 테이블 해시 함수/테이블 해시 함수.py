def solution(data, col, row_begin, row_end):
    answer = 0
    # 정렬
    data = sorted(data, key = lambda x: [x[col - 1], -x[0]])
    
    for i in range(row_begin, row_end + 1):
        total = 0
        # i행에 대해 mod 연산
        for j in data[i - 1]:
            total += (j % i)
        # mod 연산된 값의 합을 XOR연산
        answer ^= total
            
    return answer