#include <iostream>
#include <sstream>
#include <string>

using namespace std;

int overflowShield(long a, long b) {
  if(a > 2147483647/b) {
    return -1;
  }

  return 0;
}


int castStr(string str) {
  stringstream a(str);
  int rtn;
  a >> rtn;
  return rtn;
}

string castInt(int i) {
  stringstream temp;
  temp << i;
  string rtn;
  temp >> rtn;
  return rtn;
}

void prgrm(string str) {
  string astr = str.substr(0, str.find(" "));
  string bstr = str.substr(str.find(" "), str.length() - 1);
  stringstream a_(astr);
  stringstream b_(bstr);
  long a, b;
  a_ >> a;
  b_ >> b;
  //if(a < 0 || overflowShield(a, b) == -1) {
    //throw 2;
  //}
  cout << a * b << endl;
}

int main() {
  int problemCount;
  cin >> problemCount;
  if(problemCount > 1000000 || problemCount < 1) {
    return 0;
  }
  cin.clear();
  cin.ignore();
  string str;
  for(int i = 0; i < problemCount; i++) {
    getline(cin, str);
    prgrm(str);
  }

  return 0;
}
