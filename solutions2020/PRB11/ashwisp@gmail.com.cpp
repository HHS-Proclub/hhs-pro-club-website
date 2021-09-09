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

int main()
{
    long long int N, a,m,k;
    cin >> N;
    long long int sol[N];
    for (long long int x = 0; x < N; x++)
    {
      cin >> a >> m >> k;
      long long int cuts[a];
      long long int spaces[a-1];
      for (long long int y = 0; y < a; y++)
      {
        cin >> cuts[y];
      }
      sort(cuts, cuts+a);
      for (long long int y = 1; y < a; y++)
      {
        spaces[y-1] = cuts[y]-cuts[y-1]+1;
      }
      sort(spaces, spaces+a-1);
      long long int tape = a;
      long long int result = a;
      for (long long int z = 0; z < a-1; z++)
      {
        // cout << "Result: " << result << endl;
        if (tape <= k)
        {
          break;
        }
        else
        {
          result+=spaces[z]-2;
          tape--;
        }
      }
      // cout << "Final RESULT: " << result << endl;
      sol[x] = result;
    }

    for (long long int x = 0; x < N; x++)
    {
      cout << sol[x] << endl;
    }
    return 0;
}
