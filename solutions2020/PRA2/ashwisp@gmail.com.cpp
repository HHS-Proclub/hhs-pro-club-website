#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>
#include <vector>
#include <map>
#include <stack>
#include <queue>
#include <list>
#include <math.h>

using namespace std;

bool isPrime(long int n)
{
  for (long int x = 2; x < n; x++)
  {
    if (n % x == 0)
    {
      return false;
    }
  }
  return true;
}

int main()
{
  int n, numOfDigits, power;
  long int num, reversedNum, num2;

  cin >> n;
  for (int x = 0; x < n; x++)
  {
    cin >> num;
    // cout << "num: " << num << endl;
    reversedNum = 0;
    num2 = num;
    // cout << "num2: " << num2 << endl;
    power = 1;
    while((int)(num2/(pow(10,power))) != 0)
    {
      power++;
    }
    numOfDigits = power;

    // cout << "numOfDigits: " << numOfDigits << endl;
    for (int y = 0; y < numOfDigits; y++)
    {
      reversedNum+=(num2%10)*pow(10,numOfDigits-y-1);
      num2/=10;
    }

    // cout << "Reversed #: " << reversedNum << endl;
    if (num == reversedNum)
    {
      cout << "NO" << endl;
    }
    else if (isPrime(num) == true && isPrime(reversedNum) == true)
    {
      cout << "YES" << endl;
    }
    else
    {
      cout << "NO" << endl;
    }
  }
}
