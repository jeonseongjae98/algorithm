def solution(n, k):
    answer = 0
    num = ''
    while n > 0:
        remainder = n % k
        n = n // k
        num = str(remainder)+num
    
    num_list = num.split("0")
    num_list = [x for x in num_list if x!=""]
    
    for i in range(len(num_list)):
        cnt = 0
        if num_list[i] == "1":
            cnt += 1
        else:
            for j in range(2, int(int(num_list[i])**0.5)+1):
                if int(num_list[i])%j==0:
                           cnt+=1
                           break
        if cnt == 0:
            answer+=1
    
    return answer