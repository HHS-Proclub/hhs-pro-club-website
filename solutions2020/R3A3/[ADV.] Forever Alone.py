num = input()
num = str(num)
ans = 0
for i in range(len(num)):
	if num[i] == "0" or num[i] == "1" or num[i] == "2" or num[i] == "3" or num[i] == "4" or num[i] == "5" or num[i] == "6" or num[i] == "7" or num[i] == "8" or num[i] == "9":
		ans += int(num[i])
print(ans)