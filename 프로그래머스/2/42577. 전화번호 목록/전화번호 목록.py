def solution(phone_book):
    answer = True
    hash = {}
    for pn in phone_book:
        hash[pn] = 1
    
    for pn in phone_book:
        jd= ""
        for number in pn:
            jd+=number
            if jd in hash and jd != pn:
                return False
    
    return answer