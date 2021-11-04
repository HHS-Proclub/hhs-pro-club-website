t=int(input())
for _ in range(t):
    n,k=map(int,input().split())
    low=0
    high=2**30
    while True:
        if high==low+1:
            print(high)
            break
        mid=(low+high)//2
        lines=0
        for i in range(30):
            lines+=mid//k**i
        if lines>=n:
            high=mid
        else:
            low=mid
