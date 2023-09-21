def solution(number):
    answer = 0
    arr = number.split()
    for i in arr :
        answer += int(i)
    return answer % 9