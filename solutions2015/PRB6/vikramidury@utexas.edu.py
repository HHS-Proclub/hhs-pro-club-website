len = int(input())
list = []
for i in range(len):
    num = input()
    list.append(int(num))

longest = 0;

for i in range (1, 2*len-3):
    streak = 0
    pivot = i/2.0
    high = int(pivot + .5);
    low = int(pivot);
    #print "pivot=%f"%pivot
    while low >= 0 and high <= len-1:
        #if (pivot == 3.5):
        #print "%d == %d"%(list[low],list[high])
        if list[low] == list[high]:
            streak += 1
        else:
            streak = 0
        if (streak > longest):
            longest = streak
        high += 1
        low -= 1
print(longest)
