
# from collections import defaultdict, deque, Counter
# from sortedcontainers import SortedDict, SortedList, SortedSet
# import bisect
# from heapq import heappop, heappush
# =======================================
 
I = lambda : map(int, input().split())
 
# ========================================
 
# T = int(input())
 
D = dict()
D['purple'] = 'Power'
D['green'] = 'Time'
D['blue'] = 'Space'
D['orange'] = 'Soul'
D['red'] = 'Reality'
D['yellow'] = 'Mind'
 
 
for _ in range(1):
    F = str(input())
    S = str(input())
    T = str(input())
    
    cf,sf,tf = 0,0,0
    for c in F:
        if c in 'aeiou':
            cf += 1
    for c in S:
        if c in 'aeiou':
            sf += 1
    for c in T:
        if c in 'aeiou':
            tf += 1
    
    if cf == 5 and sf == 7 and tf == 5:
        print('YES')
    else:
        print('NO')
    
'''
 
1 2 3 4 5 6
 
 
'''