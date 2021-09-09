#include <iostream>
using namespace std;

int m[3] = {10, 100, 1000};
int s[3] = {1, 14, 144};

void isSpecial(int x) {
    if (x == 0) {
        cout << "YES" << endl;
    } else {
        bool special = false;
        for (int i = 0; i < 3; i++) {
            if (x%m[i] == s[i]) {
                isSpecial(x/m[i]);
                special = true;
            }
        }
        if (!special) {
            cout << "NO" << endl;
            return;
        }
    }
}

int main() {
    int numCases;
    cin >> numCases;

    for (int numCase = 0; numCase < numCases; numCase++) {
        int x;
        cin >> x;

        isSpecial(x);
    }

}
