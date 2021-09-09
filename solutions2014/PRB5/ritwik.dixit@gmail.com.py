notStr = input()
nots = notStr.count("not")

if nots % 2 == 0:
    print(notStr.replace("not", ""))
else:
    print(notStr.replace("not", "") + "not")

#not sure if second will work
#replace with real logic if not

