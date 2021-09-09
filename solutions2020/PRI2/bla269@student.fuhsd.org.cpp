#include <iostream>
#include <string>
using namespace std;

int N;
string s;
int values[9];
int better[9];

int main() {
    int numC;
    cin >> numC;

    for (int num = 0; num < numC; num++) {
        cin >> N;
        cin >> s;
        for (int i = 0; i < 9; i++) {
            cin >> values[i];
            better[i] = values[i] - (i+1);
        }


        for (int i = 0; i < N; i++) {
            if (better[s[i]-'1'] > 0) {
                while (i < N && better[s[i]-'1'] >= 0) {
                    s[i] = values[s[i]-'1'] + '0';
                    i++;
                }
                break;
            }
        }

        cout << s << endl;
    }
}
