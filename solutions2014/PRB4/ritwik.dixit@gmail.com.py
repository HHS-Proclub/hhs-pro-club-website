returns = []
nums= int(input())

for i in range(nums): 
    word = input()
    vowels = ["a", "e", "i", "o", "u"]
    if word[0] in vowels:
        returns.append(word + "way")
    else:
        returns.append(word[1:] + word[0] + "ay")


for j in returns:
    print(j)

    
