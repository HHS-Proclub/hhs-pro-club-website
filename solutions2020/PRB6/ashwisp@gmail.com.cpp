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

    int n,r,c;
    cin >> n;

    for (int x = 0; x < n; x++)
    {
      cin >> r >> c;
      int matrix[r][c];
      int positions = 0;

      for (int y = 0; y < r; y++)
      {
        for (int z = 0; z < c; z++)
        {
          cin >> matrix[y][z];
        }
      }

      for (int a = 0; a < r; a++)
      {
        for (int b = 0; b < c; b++)
        {
          if (matrix[a][b] == 0)
          {
            for (int d = 0; d < b; d++)
            {
              if (matrix[a][d] == 1)
              {
                positions++;
                break;
              }
            }
            for (int d = b+1; d < c; d++)
            {
              if (matrix[a][d] == 1)
              {
                positions++;
                break;
              }
            }
            for (int d = 0; d < a; d++)
            {
              if (matrix[d][b] == 1)
              {
                positions++;
                break;
              }
            }
            for (int d = a+1; d < r; d++)
            {
              if (matrix[d][b] == 1)
              {
                positions++;
                break;
              }
            }
          }
        }
      }
      // cout << endl;
      cout << positions << endl;
    }
    return 0;
}
