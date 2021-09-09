#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>
#include <vector>
#include <map>
#include <stack>
#include <queue>
#include <list>

using namespace std;

int main() {

    int n, i, count, num, sum;
    cin >> n;
    long long int arr[n];

    for (int x = 0; x < n; x++)
    {
      cin >> i;
      count = 0;
      for (long long int y = 19; y <= 1000000000; y++)
      {
        num = y;
        sum = 0;
        while (num > 0)
        {
          sum+=num%10;
          num/=10;
        }

        if (sum == 10)
        {
          count++;
        }

        if (count == i)
        {
          arr[x] = y;
          break;
        }
      }
    }

    for (int z = 0; z < n; z++)
    {
      cout << arr[z] << endl;
    }
    return 0;
}
