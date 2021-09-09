n = int(input())
lst = map(int, input().split())
i = int(input())

print(int((len([_ for _ in lst if _ == i])/n)*100))
