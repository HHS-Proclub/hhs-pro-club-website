#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>
#include <vector>
#include <map>
#include <stack>
#include <queue>
#include <list>
#include<math.h>

using namespace std;


int main() {

    long long int n, l, m, root;
    // root;
    cin >> n;
    string sol[n];

    for (int x = 0; x < n; x++)
    {
      cin >> l >> m;
      root = round(pow((double)l*m,1.0/3));
      if (pow(root, 3) == l*m && l%root == 0 && m%root == 0)
      {
        sol[x] = "Yes";
      }
      else
      {
        sol[x] = "No";
      }
    }

    for (int g = 0; g < n; g++)
    {
      cout << sol[g] << endl;
    }
    return 0;
}
