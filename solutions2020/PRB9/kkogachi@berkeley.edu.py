_ = int(input())

for __ in range(_):
    s = input()
    if s[0] == 'a':
        if s[1] == 'b':
            print(s)
        else:
            print(s[0]+s[2:])
    else:
        if s[1] == 'b':
            print(s[1:])
        else:
            print(s[2:])
