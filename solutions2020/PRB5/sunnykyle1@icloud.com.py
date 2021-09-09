# Giantpizzahead
# PRB5: Palindrome Formation

for i in range(int(input())):
    dancer_num, blue_cost, red_cost = list(map(int, input().split()))
    dancers = list(map(int, input().split()))
    # Left dancers' colors are added to a list
    left_dancers = dancers[:int(dancer_num / 2)]
    # print(left_dancers)
    # Same for right dancers (in reverse order)
    right_dancers = dancers[:-int(dancer_num / 2)-1:-1]
    # print(right_dancers)
    # Put suits on the dancers if needed
    if blue_cost < red_cost:
        best_suit = 0
    else:
        best_suit = 1
    minimum_cost = 0
    isPossible = True
    for left, right in zip(left_dancers, right_dancers):
        if left == right and left == 2:
            # Both dancers are open, pick the lowest cost suit for each
            if best_suit == 0:
                minimum_cost += blue_cost * 2
            else:
                minimum_cost += red_cost * 2
        elif left != right and left == 2:
            # Left dancer is open, match right dancer's suit
            if right == 0:
                minimum_cost += blue_cost
            else:
                minimum_cost += red_cost
        elif left != right and right == 2:
            # Right dancer is open, match left dancer's suit
            if left == 0:
                minimum_cost += blue_cost
            else:
                minimum_cost += red_cost
        elif left == right:
            # Dancers have same suit, so do nothing
            pass
        else:
            # Dancers have different suits, so a palindrome isn't possible
            isPossible = False
            break
    # Handle the middle dancer (if there is one)
    if dancer_num % 2 == 1 and dancers[int(dancer_num / 2)] == 2:
        if best_suit == 0:
            minimum_cost += blue_cost
        else:
            minimum_cost += red_cost
    # Print out the result
    if isPossible:
        print(minimum_cost, flush=True)
    else:
        print(-1, flush=True)
            
        
