n = int(input())
string = ""
for i in range(n):
    string += chr(i + ord('a'))

def permutations(str, perm):
    if len(str) == 0:
        print(perm)
    else:
        for i in range(len(str)):
            permutations(str[:i] + str[i+1:], perm + str[i])

permutations(string, "")
