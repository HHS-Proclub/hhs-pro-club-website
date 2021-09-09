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
    long long int years, n, max;
    cin >> years;
    long long int sol[years];
    for (long long int x = 0; x < years; x++)
    {
      cin >> n;
      long long int slimes[n];
      bool pos = false;
      bool neg = false;
      long long int max = 0;
      long long int minSlime = 10000000000;
      long long int maxSlime = -10000000000;

      for (long long int y = 0; y < n; y++)
      {
        cin >> slimes[y];
        max+=abs(slimes[y]);

        if (slimes[y] < minSlime)
        {
          minSlime = slimes[y];
        }

        if (slimes[y] > maxSlime)
        {
          maxSlime = slimes[y];
        }

        if (slimes[y] <= 0)
        {
          neg = true;
        }
        if (slimes[y] >= 0)
        {
          pos = true;
        }
      }

        // cout << "Sum: " << max << endl;

      if (pos && neg)
      {
          // cout << "Pos and negative" << endl;
      }
      else if (neg)
      {
        // cout << "Just negative" << endl;
        max+=maxSlime*2;
      }
      else
      {
        // cout << "Just positive" << endl;
        max-=minSlime*2;
      }
      if (n == 1)
      {
        max = slimes[0];
      }
      sol[x] = max;
    }

    for (long long int b = 0; b < years; b++)
    {
      cout << sol[b] << endl;
    }
    return 0;
}
