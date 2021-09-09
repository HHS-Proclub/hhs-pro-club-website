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

int main()
{
  int n, B,H,S;
  cin >> n;
  int sol[n];
  for (int i = 0; i < n; i++)
  {
    cin >> B >> H >> S;
    sol[i] = max(B-H, B-S) + 1;
  }

  for (int i = 0; i < n; i++)
  {
    cout << sol[i] << endl;
  }
}
