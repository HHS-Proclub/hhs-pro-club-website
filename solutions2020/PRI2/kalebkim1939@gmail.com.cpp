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

long long castStr(string str) {
  stringstream a(str);
  long long rtn;
  a >> rtn;
  return rtn;
}

string prgrm(string digits, string num, string map) {
  string k = "";
  string currentDigit;
  long segment = 0; // 0 = didnt start traversing yet, >0 = currently traversing, <0 done traversing
  for(long i = 1; i <= castStr(digits); i++) {
    currentDigit = takeDigitStr(num, i);
    for(int j = 0; j < 17; j += 2) {
      if((j/2 + 1) == castStr(currentDigit)) {
        if(segment >= 0 && castStr(currentDigit) < castStr(map.substr(j, 1))) {
          k = map.substr(j, 1) + k;
          segment = 1;
          break;
        } else {
          k = currentDigit + k;
          if(segment > 0) segment = -1; // if currently traversing, STOP
          break;
        }
      }
    }
  }

  return k;
}

int main() {
  long problemCount;
  cin >> problemCount;
  cin.clear();
  cin.ignore();
  string a, b, c;
  for(int i = 0; i < problemCount; i++) {
    getline(cin, a);
    getline(cin, b);
    getline(cin, c);
    cout << prgrm(a, b, c) << endl;
  }
}
