def f(x):
    a = int(x[0])
    b = int(x[2])
    c = int(x[4])
    for i in range(b):
        for j in range(a):
            if(i*5+j == c):
                return True
    return False
    
num = input()
print(f(num))
