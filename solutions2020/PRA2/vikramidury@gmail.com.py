step = int(input())
length = int(input())

def count_steps(good, length):
    bad = good/2
    full = good + bad
    
    x = int(length / full)
    r = length % full
    extra = 0
    if (r == 0):
        extra = 0;
    elif (r <= good):
        extra = 1;
    else:
        extra = 2;
        
    return x*2 + extra
    
print (count_steps(step, length))