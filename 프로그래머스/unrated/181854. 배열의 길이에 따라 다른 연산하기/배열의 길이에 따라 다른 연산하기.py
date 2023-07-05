def solution(arr, n):
    for idx, val in enumerate(arr):
        if len(arr) % 2 == 0:
            if idx % 2 == 1:
                arr[idx] += n
        else:
            if idx % 2 == 0:
                arr[idx] += n
    
    return arr