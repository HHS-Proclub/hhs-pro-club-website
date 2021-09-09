#!/usr/bin/python3

upper = 0

def main():
    global upper
    dest = int(input())
    upper = abs(dest) * 2
    find(0, dest, 0)
    print(upper)
    
    
def find(pos, goal, steps):
    global upper
    if steps >= upper:
        return
    if pos == goal:
        if steps < upper:
            upper = steps
    else:
        steps += 1
        find(pos + steps, goal, steps)
        find(pos - steps, goal, steps)
            
     

if __name__ == "__main__": main()
    

