s = input()
sarr = s.split('=')

s1 = sarr[0]
s2 = sarr[1]

for c in s1:
    if c.isalpha():
        var = c
s1a = s1.replace(var,'0')
s1b = s1.replace(var,'1')
s2a = s2.replace(var,'0')
s2b = s2.replace(var,'1')
b = eval(s1a)
a = eval(s1b)-b
d = eval(s2a)
c = eval(s2b)-d
print((int)((b-d)/(c-a)))
