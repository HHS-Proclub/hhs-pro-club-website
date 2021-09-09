'''
PRB9: Perfect Integer
Alright, this one seems pretty easy too...
So we're doing a time limit again! YAYYYY

Time limit: 20 minutes (since this one seems a bit harder,
but I'm also making the time limit harsher)
Actual time taken: ?
'''
# Figure out the first 10,000 perfect integers
i = 0
perfect_integers = []
current_number = 10
while i < 10000:
    current_number += 9
    temp_sum = 0
    for digit in str(current_number):
        temp_sum += int(digit)
        if temp_sum > 10:
            break
    if temp_sum == 10:
        i += 1
        perfect_integers.append(current_number)


# Input parsing (no attempts again since speed run)
for _ in range(int(input())):
    number = int(input())
    print(perfect_integers[number - 1], flush=True)
