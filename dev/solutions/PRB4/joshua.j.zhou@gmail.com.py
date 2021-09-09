n = int(input())

words = [input() for _ in range(n)]
vowels = ['a', 'e', 'i', 'o', 'u']

for word in words:
    if word[0] in vowels:
        print(word + 'way')
    else:
        print(word[1:] + word[0] + 'ay')
