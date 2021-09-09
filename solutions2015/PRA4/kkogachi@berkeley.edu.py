n = int(input())
alphabet = 'abcdefghijklmnopqrstuvwxyz'
use = list(alphabet[:n])

def permutate(pre, use, used):
    if len(use) == len(used):
        print(pre)
    for l in use:
        if l not in used:
            permutate(pre+l, use, used+[l])

permutate("",use,[])
