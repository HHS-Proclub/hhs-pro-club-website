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

string prgrm(string leng, string s) {
  int zeroes = 0;
  int ones = 0;
  for(int i = 0; i < castStr(leng); i++) {
    if(s.substr(i, 1).compare("z") == 0) {
      zeroes++;
      continue;
    } else if(s.substr(i, 1).compare("n") == 0) {
      ones++;
    }
  }

  if(zeroes == 0 && ones == 0) return "0";

  string output = "";
  if(zeroes >= 1) {
    while(ones > 0) {
      output = output + "1 ";
      ones--;
    }
    while(zeroes > 1) {
      output = output + "0 ";
      zeroes--;
    } output = output + "0";
  }

  if(ones >= 1) {
    while(ones > 1) {
      output = output + "1 ";
      ones--;
    } output = output + "1";
  }
  
  return output;
}

int main() {
  int problemCount;
  cin >> problemCount;
  cin.clear();
  cin.ignore();
  string a, b;
  for(int i = 0; i < problemCount; i++) {
    getline(cin, a);
    getline(cin, b);
    cout << prgrm(a, b) << endl;
  }

  return 0;
}
