def solution(arr1, arr2):
    answer = []
    
    for i in range(len(arr1)):
        list=[]
        for j in range(len(arr2[0])):
            n = 0
            for k in range(len(arr1[0])):
                n += arr1[i][k] * arr2[k][j]
            list.append(n)
        answer.append(list)
        
    return answer