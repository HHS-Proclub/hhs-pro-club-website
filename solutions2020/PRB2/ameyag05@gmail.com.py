inp = int(input())

x = []
for j in range (inp):
    places = []
    Rooms = input()
    lights = input().split()
    lights = list(lights)
    for j in lights:
        places.append(int(j))
    moves = 0

    for i in range(1,len(places)-1):
        if places[i] == 0 and places[i-1] == 1 and places[i+1] == 1 and i != (len(places)-1):
            moves = moves + 1 
            places[i + 1] = 0
    x.append(moves)
        


        
for k in x:
    print(k)