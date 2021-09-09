#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int takeDigitInt(int num, int place) { // 1 place being the 1's place
  return (num%(10*place))/(10*(place-1));
}

string takeDigitStr(string num, int place) { // same as above function but inputs string
  return num.substr(num.length()-(place-1)-1, 1);
}

int castStr(string str) {
  stringstream a(str);
  int rtn;
  a >> rtn;
  return rtn;
}

void prgrm(string digits, string num, string map) {
  string k = "";
  string temp;
  for(int i = 1; i <= castStr(digits); i++) {
    temp = takeDigitStr(num, i);
    for(int j = 0; j < 17; j += 2) {
        if((j/2 + 1) == castStr(temp)) { // problem here. set value of j/2 == temp
          k = map.substr(j, 1) + k;
          break;
        }
    } // iterate through map
  }

  cout << k << endl;
}

int main() {
  int problemCount;
  cin >> problemCount;
  cin.clear();
  cin.ignore();
  string a, b, c;
  for(int i = 0; i < problemCount; i++) {
    getline(cin, a);
    getline(cin, b);
    getline(cin, c);
    prgrm(a, b, c);
  }

  return 0;
}
