n = input()
count = 0
answers = []
for x in range(0,int(n),1):
    num_candies = int(input())
    count = 1
    while(num_candies >= (count)):
        num_candies -= count
        count+=1
    answers.append(count -1)
for answer in answers:
    print(answer)
