def solution(m, musicinfos):
    answer = ''
    result = list()
    for i in musicinfos:
        info = i.split(',')
        
        hour = int(info[1].split(':')[0]) - int(info[0].split(':')[0])
        minute = int(info[1].split(':')[1]) - int(info[0].split(':')[1])
        time = hour * 60 + minute
        
        music = list(info[-1])
        i = 1
        while i < len(music) and '#' in music:
            if music[i] == '#':
                music[i-1] = music[i-1] + music[i]
                del music[i]
            else:
                i+=1
                
        length = len(music)
        play = music * (time//length) + music[:time%length]
        
        m = list(m)
        i = 1
        while i < len(m) and '#' in m:
            if m[i] == '#':
                m[i-1] = m[i-1] + m[i]
                del m[i]
            else:
                i+=1
                
        for i in range(len(play)-len(m)+1):
            if play[i: i+len(m)] == m:
                result.append([info[2], time])
                break
        
        if len(result) > 0:
            result.sort(key = lambda x : x[1], reverse = True)
            answer = result[0][0]
        else:
            answer = '(None)'
        
    return answer