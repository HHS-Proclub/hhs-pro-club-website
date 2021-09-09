numadd = input()
output = ""

for i in range(int(numadd)):
    pair = input().split()
    output += str(int(pair[0])+int(pair[1]))+"\n"

print(output[:len(output)-1])
