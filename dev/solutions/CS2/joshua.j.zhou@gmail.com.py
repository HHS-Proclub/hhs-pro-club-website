n = int(input())

s = [int(i) for i in input().split()]
p = s[0]

def pivot(p):
    pI = 0
    s[pI], s[-1] = s[-1], s[pI]
    sI = 0
    for i in range(0, len(s)):
        if s[i] < p:
            s[i], s[sI] = s[sI], s[i]
            sI += 1
    s[sI], s[-1] = s[-1], s[sI]

def partition(arr):
    if len(arr) <= 1:
        return arr

    less = []
    eqpiv = []
    greater = []

    pI = 0
    pivot = arr[0]

    for i in range(len(arr)):
        if arr[i] < pivot:
            less.append(arr[i])
        elif arr[i] == pivot:
            eqpiv.append(arr[i])
        else:
            greater.append(arr[i])

    return less + eqpiv + greater

s = partition(s)

print(' '.join(str(i) for i in s))
