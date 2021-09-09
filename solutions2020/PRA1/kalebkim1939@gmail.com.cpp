#include <iostream>
#include <string>

using namespace std;

/* not needed but keeping for later reference
int castStr(string str) {
  stringstream str_(str);
  int num;
  str_ >> num;
  return num;
} */

bool prgrm(string a) {
  if(a.length() == 0) return false;
  if(a.substr(0, 1).compare("1") == 0) {
    int fours = 0;
    for(int i = 1; i < a.length(); i++) {
      if(a.substr(i, 1).compare("1") == 0) {
        fours = 0;
        continue;
      } else if(a.substr(i, 1).compare("4") == 0) {
        fours++;
        if(fours == 3) {
          return false;
        }
        continue;
      }

      return false;
    }

    return true;
  }

  return false;
}

int main() {
  int problemCount;
  cin >> problemCount;
  cin.clear();
  cin.ignore();
  string str;
  for(int i = 0; i < problemCount; i++) {
    getline(cin, str);
    if(prgrm(str) == true) {
      cout << "YES" << endl;
    } else {
      cout << "NO" << endl;
    }
  }

  return 0;
}
