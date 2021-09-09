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

bool isPowerOfTwo(long long int num)
{
  if (log2(num) == floor(log2(num)))
  {
    return true;
  }
  else
  {
    return false;
  }
}

int main()
{
  int n, elements, count;
  cin >> n;
  int output[n];

  for (int x = 0; x < n; x++)
  {
    cin >> elements;
    long long int arr[elements];
    bool canMakePowerOfTwo[elements];
    int count = 0;

    for (int y = 0; y < elements; y++)
    {
      cin >> arr[y];
      canMakePowerOfTwo[y] = false;
    }

    for (int z = 0; z < elements; z++)
    {
      bool flag = false;
      if (canMakePowerOfTwo[z] == false)
      {
        for (int a = 0; a < elements; a++)
        {
          // cout << "Comparing elements " << arr[z] << " and " << arr[a] << endl;
          if (a != z && isPowerOfTwo(arr[z] + arr[a]))
          {
            // cout << "Forms a power of 2" << endl;
            canMakePowerOfTwo[z] = true;
            canMakePowerOfTwo[a] = true;
            flag = true;
          }
        }

        if (flag == false)
        {
          count++;
        }
      }
    }
    output[x] = count;
  }

  for (int b = 0; b < n; b++)
  {
    cout << output[b] << endl;
  }

  // cout << "1000000000: " << log2(1000000000) << endl;
}
