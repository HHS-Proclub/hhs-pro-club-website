 numprobs = input()
problems = []
for c in range(0,int(numprobs)):
    problems.append(input())
for c in problems:
    problem = c.partition(' ')
    print(int(problem[0])+int(problem[2]))
