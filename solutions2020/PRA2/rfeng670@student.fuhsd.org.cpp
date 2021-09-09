#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

int backwards(int a)
{
	int c = a;
	vector<int> digits;
	while(c > 10)
	{
		digits.push_back(c%10);
		c/=10;
	}
	digits.push_back(c);
	int r = 0;
	for(int i = 0; i < digits.size(); i++)
	{
		r*=10;
		r+=digits[i];
	}
	return r;
}

int main()
{
	int MAX = 1000000;
	int n;
	cin >> n;
	int nums[n];
	for(int i = 0; i < n; i++)
	{
		cin >> nums[i];
	}
	vector<int> primes;
	primes.push_back(2);
	bool prime[1000001];
	for(int i = 0; i <= 1000000; i++) prime[i] = false;
	//int ind = 1;
	bool isPrime;
	for(int i = 2; i < MAX+1; i++)
	{
		isPrime = true;
		for(int j = 0; primes[j] * primes[j] <= i && j < primes.size(); j++)
		{
			if(i % primes[j] == 0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			primes.push_back(i);
			prime[i] = true;
			//ind++;
			//cout << i << " is prime." << endl;
		}
	}
	for(int i = 0; i < n; i++)
	{
		if(nums[i] != backwards(nums[i]) && prime[nums[i]] && prime[backwards(nums[i])])
		{
			//cout << backwards(nums[i]) << endl;
			cout << "YES" << endl;
		}
		else cout << "NO" << endl;
	}
}
