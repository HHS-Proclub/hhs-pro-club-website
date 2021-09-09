inp = int(input())
answers = []
for timesRun in range(inp):
    a, b = input().split()
    answer = int(a)*int(b)
    answers.append(answer)
for i in answers:
    print(i)