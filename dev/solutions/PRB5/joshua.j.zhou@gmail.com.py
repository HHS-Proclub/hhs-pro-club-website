sentence = input().split()

start = sentence.index('not')
end = len(sentence) - sentence[::-1].index('not')

nots = sentence[start:end]
if len(nots) % 2 == 0:
    sentence[start:end] = []
else:
    sentence[start:end] = ['not']

print(' '.join(sentence))
