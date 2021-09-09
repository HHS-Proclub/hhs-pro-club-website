'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
timesRun = int(input())
def Remove(duplicate): 
    final_list = [] 
    for num in duplicate: 
        if num not in final_list: 
            final_list.append(num) 
    return final_list 
ansList = []
for ite in range(timesRun):
    xlist = []
    ylist = []
    drifts = int(input())
    for bloid in range(drifts):
        x, y = map(int, input().split())
        xlist.append(x)
        ylist.append(y)
    mylist = Remove(xlist)
    mylist1 = Remove(ylist)
    if len(mylist1)>len(mylist):
        ansList.append((len(mylist)-1))
    else:
        ansList.append((len(mylist1)-1))
for a in ansList:
    print(a)