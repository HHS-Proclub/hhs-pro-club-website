#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>
#include <vector>
#include <map>
#include <stack>
#include <queue>
#include <list>
#include <deque>
#include <set>

using namespace std;

// Codeforces Magic Numbers 320A
bool isSpecial(long long int x)
{
  int arr[10];
  int dig = 0;
  while (x != 0)
  {
    arr[dig] = x % 10;
    x/=10;
    dig++;
  }

  /*for (int i = 0; i < dig; i++)
  {
    cout << arr[i] << " ";
  }
  cout << endl;*/

  // Not magic number if
  // First digit is not 1
  if (arr[dig-1] != 1)
  {
    return false;
  }

  // There are more than 2 four's in a row
  int count = 0;
  for (int i = 0; i < dig; i++)
  {
    if (arr[i] != 4)
    {
      count = 0;
    }
    else
    {
      count++;
    }
    // cout << "Count: " << count << endl;
    if (count > 2)
    {
      return false;
    }
  }

  // Digit other than 1 or 4
  for (int i = 0; i < dig; i++)
  {
    if (arr[i] != 1 && arr[i] != 4)
    {
      return false;
    }
  }

  return true;
}

int main()
{
  int n, num;
  cin >> n;
  string sol[n];
  for (int i = 0; i < n; i++)
  {
    cin >> num;
    if (isSpecial(num))
    {
      sol[i] = "YES";
    }
    else
    {
      sol[i] = "NO";
    }
  }

  for (int i = 0; i < n; i++)
  {
    cout << sol[i] << endl;
  }
}
