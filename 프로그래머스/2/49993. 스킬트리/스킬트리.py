def solution(skill, skill_trees):
    answer = 0
    for sts in skill_trees:
        s = ""
        for st in sts:
            if st in skill:
                s+=st
    
        if skill.startswith(s):
            answer+=1
    
    
    return answer