size = int(raw_input())
skip = int(raw_input())
arr = range(1, size + 1)

def roundOne(array, index):
    while(len(array) > 1):
        array.pop(index - 1)
        index = (index + skip) % len(array)
    return array[0]

arrcopy = arr[:]
for i in range(1, size):
    if roundOne(arrcopy, i) == size:
        print i
        break
    else:
        arrcopy = arr[:]
        
    

