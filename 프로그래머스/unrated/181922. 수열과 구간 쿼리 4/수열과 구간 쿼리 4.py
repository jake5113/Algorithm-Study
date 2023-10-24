def solution(arr, queries):
    answer = arr
    for subList in queries:
        for i in range(subList[0], subList[1] + 1):
            if i % subList[2] == 0:
                answer[i] += 1
    return answer