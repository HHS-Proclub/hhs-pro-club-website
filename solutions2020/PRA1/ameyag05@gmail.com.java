
timesRun = int(input())
answers = []
def checker():
    number = input()
    for i in range (len(number)):
        if number[i] != '1' and number[i] != '4':
            answers.append("NO")
            return None
        elif number[i] == '4' and number[i-1] == '4' and number[i+1] == '4':
            answers.append("NO") 
            return None
        elif number[0] == '4':
            answers.append("NO")
            return None
    answers.append("YES")
for ogrange in range (timesRun):      
    checker()     
for i in answers:
    print(i)