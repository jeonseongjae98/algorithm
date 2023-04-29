def solution(bin1, bin2):
    answer = 0
    answer1 = 0
    answer2 = []
    n = 1
    n1 = 1
    h = []
    if bin1 == "0" and bin2 == "0":
        return "0"
    else:
        for i in bin1:
            answer += int(i) * (2 ** (len(bin1) - n))
            n += 1

        for i in bin2:
            answer1 += int(i) * (2 ** (len(bin2) - n1))
            n1 += 1

        a = answer + answer1

        while(a > 0):
            answer2.append(a % 2)
            a //= 2
        aa = answer2[::-1]
        for i in aa:
            h.append(str(i))
        return ''.join(h)