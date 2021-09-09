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
vector<long long int> num;
map<long long int, bool> added;

int main() {

    for (long long int x = 2; x <= 1000000; x++)
    {
      long long int exponent = 3;
      while (pow(x,exponent) <= 10e18)
      {
        // cout << "Base: " << x << " Exp: " << exponent << endl;
        // cout << "Added" << endl;
        if (!(sqrt(pow(x,exponent)) - floor(sqrt(pow(x,exponent))) == 0))
        {
          num.push_back(pow(x,exponent));
        }
        exponent++;
      }
    }
    sort(num.begin(), num.end());
    num.erase(unique(num.begin(), num.end()), num.end());

    int n;
    long long int a,b,count;
    cin >> n;
    long long int sol[n];

    for (int x = 0; x < n; x++)
    {
      cin >> a >> b;
      // cout << "a: " << a << " b: " << b << endl;
      count = 0;
      count+=upper_bound(num.begin(), num.end(), b) - lower_bound(num.begin(), num.end(), a);
      // cout << floor(sqrt(b))-floor(sqrt(a-1)) << endl;
      count+=floor(sqrt(b))-floor(sqrt(a-1));
      sol[x] = count;
    }

    for (int a = 0; a < n; a++)
    {
      cout << sol[a] << endl;
    }
    return 0;
}
