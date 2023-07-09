import math
def solution(numer1, denom1, numer2, denom2):
    boonmo = denom1 * denom2
    boonja = numer1 * denom2 + numer2 * denom1
    gcd = math.gcd(boonmo, boonja)
    answer = [boonja / gcd, boonmo / gcd]
    return answer


