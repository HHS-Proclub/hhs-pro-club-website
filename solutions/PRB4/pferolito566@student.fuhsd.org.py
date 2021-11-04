t=int(input())
for i in range(t):
    upCount=0
    word=input()
    lower=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
    for j in range(len(word)):
        if word[j] not in lower:
           upCount+=1
    if upCount*2>len(word):
        print(word.upper())
    else:
        print(word.lower())
