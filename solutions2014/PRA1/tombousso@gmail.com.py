x = int(raw_input().strip(),16)
y = int(raw_input().strip(),16)
def find():
	for i in range(0xffff,1,-1):
		if(x % i == 0 and y % i == 0):
			return i
f = find()
print(f)
print("%04x"%f)
