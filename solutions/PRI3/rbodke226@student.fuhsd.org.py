t=int(input())
for _ in range(t):
	ans=0
	n=int(input())
	flats=input().split()
	for i in range(n):
		flats[i]=int(flats[i])
	one=False
	ten=False
	for i in range(n):
		if flats[i]==1 and one==False:
			one=True
		if flats[i]==0 and one==True and ten==False:
			ten=True
		if flats[i]==1 and ten==True:
			one=False
			ten=False
			flats[i]=0
			ans+=1
	print(ans)
			