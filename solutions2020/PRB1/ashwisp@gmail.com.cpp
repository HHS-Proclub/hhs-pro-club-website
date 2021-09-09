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
  long int n, a, b;
  cin >> n;
  long long int sol[n];
  for (int i = 0; i < n; i++)
  {
    cin >> a >> b;
    sol[i] = a*b;
  }

  for (int i = 0; i < n; i++)
  {
    cout << sol[i] << endl;
  }
}
