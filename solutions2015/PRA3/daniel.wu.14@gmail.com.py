__author__ = 'Daniel Wu'

def __main__():
    index = 0
    num_pot = int(input())
    pots = []
    for n in range(num_pot):
        pots.append(int(input()))
    for k in range(num_pot):
        left_sum = 0
        right_sum = 0
        for i in range(k):
            left_sum += pots[i]
        for l in range(num_pot-1,k,-1):
            right_sum += pots[l]

        if left_sum == right_sum and left_sum != 0:
            index = k

    print(index)

if __name__ == '__main__':
    __main__()