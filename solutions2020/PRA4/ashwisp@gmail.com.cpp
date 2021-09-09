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
int digits;
char arr[200];

bool isPartitionable(int k)
{
  int sum = 0;
  for (int x = 0; x < digits; x++)
  {
    sum+=(arr[x]-'0');
  }
  // cout << "Sum: " << sum << endl;

  if (sum % k != 0)
  {
    return false;
  }

  int subsetsum = sum/k;
  int currentsum = 0;
  // cout << "Subset sum: " << subsetsum << endl;
  int groups = 0;

  for (int y = 0; y < digits; y++)
  {
    currentsum+=(arr[y]-'0');
    if (currentsum == subsetsum)
    {
      groups++;
      currentsum = 0;
    }
  }
  return (groups == k);
}


int main() {

    int n;
    cin >> n;

    string sol[n];

    for (int x = 0; x < n; x++)
    {
      bool flag = false;
      cin >> digits;

      for (int a = 0; a < digits; a++)
      {
        cin >> arr[a];
      }

      for (int z = 2; z <= digits; z++)
      {
        if (isPartitionable(z))
        {
          // cout << "Set can be partitioned into " << z << " groups" << endl;
          flag = true;
          sol[x] = "YES";
          break;
        }
      }

      if (!flag)
      {
        sol[x] = "NO";
      }
    }

    for (int b = 0; b < n; b++)
    {
      cout << sol[b] << endl;
    }
    return 0;
}
