
def compress(text):
    compressed = ""
    last = ''
    freq = 1
    for c in text:
        if c == last:
            freq += 1
        else:
            if last != '':
                compressed += str(freq)
                freq = 1
            compressed += c
        last = c
    return compressed + str(freq)
    
s = input()
print(compress(s))
