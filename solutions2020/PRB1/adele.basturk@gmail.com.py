#!/usr/bin/python3

def candy_count(n):
    t=0
    i=0
    while(t<=n):
        i=i+1
        t=t+i
    print(i-1)
    return i-1


num_entries = int(input())

for i in range(num_entries):
	current_line = input()
	n_array = current_line.split()
	n = int(n_array[0])
	candy_count(n)



