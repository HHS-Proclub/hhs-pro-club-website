#def f(x):
   # p = x.split(" ")
   # a = int(p[0])
   # b = int(p[1])
   # c = int(p[2])
    #for i in range(b+1):
   #     for j in range(a+1):
   #         if(i*5+j == c):
   #             return True
   # return False
    
#num1 = input()
#p = num1.split('\n')
#print(f(p[0])) 
#print(f(p[1]))
#print(f(p[2]))
#print(f(p[3]))
#print(f(p[4]))
def f(x):
    p = x.split(" ")
    a = int(p[0])
    b = int(p[1])
    c = int(p[2])
    for i in range(b+1):
        for j in range(a+1):
            if(i*5+j == c):
                return True
    return False
    
num1 = input()
num2 = input()
num3 = input()
num4 = input()
num5 = input()
print(str(f(num1)).lower()) 
print(str(f(num2)).lower())
print(str(f(num3)).lower())
print(str(f(num4)).lower())
print(str(f(num5)).lower())