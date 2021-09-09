lines = []
while True:
    line = input()
    if line:
        lines.append(line)
    else:
        break
text = '\n'.join(lines)

inputs = [int(i) for i in lines]
print(sum(inputs))
