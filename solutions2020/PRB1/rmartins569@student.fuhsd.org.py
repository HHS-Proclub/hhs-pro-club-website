def seats():
  numbers = input()
  numbers = numbers.split()
  numbers[0] = int(numbers[0])
  numbers[1] = int(numbers[1])
  print(numbers[0]*numbers[1])

num_test_cases = int(input())

for i in range(num_test_cases):
  seats()