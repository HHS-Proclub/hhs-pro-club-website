lst = [int(input()) for _ in range(5)]
lst = sorted(lst)

if sum(lst[:4]) == lst[4]:
    print(lst[4])
else:
    print(sum(lst))
