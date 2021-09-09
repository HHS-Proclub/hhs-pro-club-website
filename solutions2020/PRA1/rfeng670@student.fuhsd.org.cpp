#include <iostream>
using namespace std;

int answer(int i)
{
	int current = i+1;
	int digits[4];
	while(true)
	{
		int c = current;
		int nd = 0;
		digits[0] = digits[1] = digits[2] = digits[3] = -1;
		while(c > 0)
		{
			digits[nd] = c%10;
			nd++;
			c/=10;
		}
		if(digits[0] != digits[1] && digits[0] != digits[2] && digits[0] != digits[3] && digits[1] != digits[2] && digits[1] != digits[3] && digits[2] != digits[3])
		{
			return current;
		}
		current++;
	}
}

int main()
{
	int n;
	cin >> n;
	int inputs[n];
	for(int i = 0; i < n; i++)
	{
		cin >> inputs[i];
	}
	for(int i = 0; i < n; i++)
	{
		cout << answer(inputs[i]) << endl;
	}
}
