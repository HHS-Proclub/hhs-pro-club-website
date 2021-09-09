#include <iostream>
#include <sstream>
#include <string>

using namespace std;

void prgrm(string str) {
  string astr = str.substr(0, str.find(" "));
  string bstr = str.substr(str.find(" "), str.length() - 1);
  stringstream a_(astr);
  stringstream b_(bstr);
  int a, b;
  a_ >> a;
  b_ >> b;
  cout << a + b << endl;
}

int main() {
  int problemCount;
  cin >> problemCount;
  cin.clear();
  cin.ignore();
  string str;
  for(int i = 0; i < problemCount; i++) {
    getline(cin, str);
    prgrm(str);
  }

  return 0;
}
