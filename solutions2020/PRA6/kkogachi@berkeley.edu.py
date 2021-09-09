n = int(input())
dic = ['pi','ka','chu']
for _ in range(n):
    s = input()
    last_index = 0
    for i in range(1,len(s)+1):
        if s[last_index:i] in dic:
            last_index += len(s[last_index:i])
    if last_index != len(s):
        print("NO")
    else:
        print("YES")
