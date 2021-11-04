#include <iostream>
using namespace std;


int t;
string s;
int upperCase = 0, lowerCase = 0;


int main() {
cin >> t;
for(int i = 1; i <= t; i++) {
 cin >> s;
 lowerCase = upperCase = 0;
 for(int j = 0; j < s.length(); j++) {
  if('a' <= s[j] && s[j] <= 'z') {
   lowerCase++;
  } else {
   upperCase++;
  }
 }
 for(int j = 0; j < s.length(); j++) {
  if(lowerCase >= upperCase) {
   if('A' <= s[j] && s[j] <= 'Z') {
    s[j] += 'a'-'A';
   }
  } else {
   if('a' <= s[j] && s[j] <= 'z') {
    s[j] += 'A'-'a';
   }
  }
 }
 cout << s << "\n";
}
return 0;
}