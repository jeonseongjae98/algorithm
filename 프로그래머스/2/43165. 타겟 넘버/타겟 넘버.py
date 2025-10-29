def solution(numbers, target):
    answer = 0
    n = len(numbers)
    
    def dfs(idx, result):
        nonlocal answer
        if idx == n:
            if result == target:
                answer+=1
            return
        else:
            dfs(idx+1, result+numbers[idx])
            dfs(idx+1, result-numbers[idx])
    dfs(0,0)
    return answer