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
    int n, d, costb, costr, mincost;
    cin >> n;
    int sol[n];

    for (int x = 0; x < n; x++)
    {
      mincost = 0;
      cin >> d >> costb >> costr;
      int arr[d];
      for (int y = 0; y < d; y++)
      {
        cin >> arr[y];
      }

      for (int y = 0; y < d/2; y++)
      {
        if (arr[y] != arr[d-y-1])
        {
          if (arr[y] == 2)
          {
            if (arr[d-y-1] == 0)
            {
              mincost+=costb;
            }
            else
            {
              mincost+=costr;
            }
          }
          else if (arr[d-y-1] == 2)
          {
            if (arr[y] == 0)
            {
              mincost+=costb;
            }
            else
            {
              mincost+=costr;
            }
          }
          else
          {
            mincost = -1;
            break;
          }
        }
        else if (arr[y] == 2 && arr[d-y-1] == 2)
        {
          mincost+=min(costb, costr)*2;
        }
      }

      if (d%2 != 0 && arr[d/2] == 2 && mincost != -1)
      {
        mincost+=min(costb, costr);
      }
      sol[x] = mincost;
    }

    for (int g = 0; g < n; g++)
    {
      cout << sol[g] << endl;
    }
}
