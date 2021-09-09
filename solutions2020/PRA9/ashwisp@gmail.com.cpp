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
    int years, n, bookshelf, min_excess;
    cin >> years;

    for (int x = 0; x < years; x++)
    {
      cin >> n >> bookshelf;
      int cows[n+1];
      int sum = 0;

      for (int y = 1; y <= n; y++)
      {
        cin >> cows[y];
        sum+=cows[y];
      }

      bool dpmatrix[n+1][sum+1];
      for (int z = 0; z <= n; z++)
      {
        dpmatrix[z][0] = true;
      }
      for (int a = 1; a <= sum; a++)
      {
        dpmatrix[0][a] = false;
      }

      for (int b = 1; b <= n; b++)
      {
        for (int c = 1; c <= sum; c++)
        {
          if (c < cows[b])
          {
            dpmatrix[b][c] = dpmatrix[b-1][c];
          }
          else
          {
            if (dpmatrix[b-1][c] == true)
            {
              dpmatrix[b][c] = true;
            }
            else
            {
              dpmatrix[b][c] = dpmatrix[b-1][c-cows[b]];
            }
          }
        }
      }

      bool found = false;
      int height = bookshelf;
      while (!found)
      {
        if (dpmatrix[n][height] == true)
        {
          found = true;
          min_excess = height - bookshelf;
          break;
        }
        height++;
      }

      cout << min_excess << endl;
    }
    return 0;
}
