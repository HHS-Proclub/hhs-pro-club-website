#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

int main() {
  int n;
  vector<string> ns;

  cin >> n;
  
  int i = 0;
  while (i < n) {
    string tempin;
    cin >> tempin;
    ns.push_back(tempin);
    i++;
  }

  i = 0;

  while (i < n) {
    int binary_num = 0;
    int x = 0;
    while (x < ns[i].size()) {
      if (ns[i][x] == '1') {
        binary_num = binary_num + pow(2,x);
      }
      x++;
    }
    
    int count = 0;
    while (binary_num != 1) {
      count++;
      if (binary_num % 2 == 1) {
        binary_num++;
        continue;
      } else {
        binary_num = binary_num/2;
      }
    }

    
    cout << count << "\n";
    i++;
  }


}