for _ in range(0,5):
    b1, b5, goal = [int(x) for x in input().split()]
    fivers = goal//5
    print(str((b5 >= fivers and (goal%5) <= b1) or ((b5 < fivers) and (goal - 5*b5) <= b1)).lower())
