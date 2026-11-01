def solution(answers):
    answer = []
    score = [0,0,0]
    
    student1 = [1,2,3,4,5]
    student2 = [2,1,2,3,2,4,2,5]
    student3 = [3,3,1,1,2,2,4,4,5,5]
    
    for i in range(len(answers)) :
        if answers[i] == student1[i%5] :
            score[0] += 1
        if answers[i] == student2[i%8] :
            score[1] += 1
        if answers[i] == student3[i%10] :
            score[2] += 1
    
    for idx, num in enumerate(score):
        if num == max(score):
            answer.append(idx+1)
        

    return answer