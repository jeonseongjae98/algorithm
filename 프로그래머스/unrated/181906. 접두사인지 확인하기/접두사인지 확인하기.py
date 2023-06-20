def solution(my_string, is_prefix):
    answer = 0
    if len(my_string) >= len(is_prefix):
        for i in range(0, len(is_prefix)):
            if my_string[i] == is_prefix[i]:
                pass
            else:
                return 0
        return 1
    else:
        return 0