n = int(input())

for _ in range(n):
   i = int(input())
   for j in range(1,i+1):
       if i % j == 0:
           print(j)
