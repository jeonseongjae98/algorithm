def solution(n, words):
    used = set()
    
    
    for i in range(len(words)):
        if words[i] in used:
            return [(i%n)+1, (i//n)+1]
        
        if i>0 and words[i-1][-1] != words[i][0]:
            return [(i%n)+1, (i//n)+1]
        
        used.add(words[i])
        
    return [0,0]