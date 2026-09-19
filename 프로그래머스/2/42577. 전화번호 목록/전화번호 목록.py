def solution(phone_book):
    hash_map = {}
    for pn in phone_book:
        hash_map[pn] = 1
        
    for pn in phone_book:
        jd = ""
        for n in pn:
            jd += n
            if jd in hash_map and jd != pn:
                return False
    return True