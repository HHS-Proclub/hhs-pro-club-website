for _ in range(int(input())):
    num=int(input(),2)
    ans=0
    while num!=1:
        if num%2==0:
            num/=2
        else:
            num+=1
        ans+=1
    print(ans)
        
