def check_row (ones, fives, length):
    while (ones >= 0 and fives >= 0):
        while (length > 5 and fives > 0):
            length -= 5
            fives -= 1
        return ones >= length
    return false
        
results = []

for i in range (0, 5):
    ones, fives, length = input().split()
    results.append(check_row(int(ones), int(fives), int(length)))
    
for result in results:
    print("true" if result else "false")