i = int(raw_input())
if i % 5 == 0 and i % 3 == 0:
    print "fizzbuzz"
elif i % 3 == 0:
    print "fizz"
elif i % 5 == 0:
    print "buzz"
else:
    print i
