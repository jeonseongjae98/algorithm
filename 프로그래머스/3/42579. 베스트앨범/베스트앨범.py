def solution(genres, plays):
    answer = []
    total = {}
    gen = {}
    
    for i in range(len(genres)):
        total[genres[i]] = total.get(genres[i], 0) + plays[i]
        gen[genres[i]] = gen.get(genres[i], []) + [(plays[i],i)]
    gensort = sorted(total.items(), key=lambda x:x[1], reverse=True)
    for (genre, totalplay) in gensort:
        gen[genre] = sorted(gen[genre], key=lambda x: x[0], reverse=True)
        answer += [idx for (play, idx) in gen[genre][:2]]
    
    
    return answer