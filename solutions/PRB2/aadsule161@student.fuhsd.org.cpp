#include<iostream>
#include<string>
using namespace std;

int main() {
    int i;
    scanf("%i\n", &i);
    while(i > 0) {
        string line1, line2, line3;
        getline(cin, line1);
        getline(cin, line2);
        getline(cin, line3);

        int l1c = 0, l2c = 0, l3c = 0;
        for(const char& c : line1) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                l1c++;
            }
        }

        for(const char& c : line2) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                l2c++;
            }
        }

        for(const char& c : line3) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                l3c++;
            }
        }

        if(l1c == 5 && l2c == 7 && l3c == 5) {
            
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
       
        --i;
    }
    return 0;
}
