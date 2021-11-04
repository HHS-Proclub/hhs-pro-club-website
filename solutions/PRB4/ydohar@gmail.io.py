import fileinput
 
inputs = []
for x in fileinput.input():
	if x == "":
		break
	inputs.append(x)
 
inputs.pop(0)
 
string=""
for x in inputs:
    count = 0
    a = x.replace('\n','')
    for char in a:
        if char.isupper():
            count +=1
        elif char.islower():
            count -=1
    if count > 0:
        string+=a.upper()
        string+="\n"
    else:
        string+=a.lower()
        string+="\n"
print(string)