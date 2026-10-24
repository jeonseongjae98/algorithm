from heapq import heappush, heappop

def solution(jobs):
    jobs.sort()
    num = len(jobs)
    waiting = [] # (소요시간, 요청시점)
    count = [] # 각 작업이 몇초 걸렸는지
    now = 0 #현재 시각

    while len(count) != num : 
        while jobs and now >= jobs[0][0] : 
            top = jobs.pop(0)
            heappush(waiting, (top[1], top[0]))

        if jobs and waiting == []:
            top = jobs.pop(0)
            now = top[0]
            heappush(waiting, (top[1], top[0]))
  

        x,y = heappop(waiting)
        now += x 
        count.append(now-y)

    return sum(count)//num