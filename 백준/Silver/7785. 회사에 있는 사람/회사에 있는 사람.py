T = int(input()) # 테스트 케이스 수
dic = {}


for i in range(T):
    name, log = input().split()
    dic[name] = log
    if log == 'leave':
        del dic[name]

for key in sorted(dic, reverse=True):
    print(key)