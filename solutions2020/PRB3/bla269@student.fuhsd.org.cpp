#include <iostream>
#include <string>
using namespace std;

int numC;

int main() {
    cin >> numC;
    for (int num = 0; num < numC; num++) {
        int length;
        cin >> length;
        int z, n;
        z = n = 0;
        for (int i = 0; i < length; i++) {
            char x;
            cin >> x;
            if (x == 'z') {
                z++;
            }
            else if (x == 'n') {
                n++;
            }
        }

        for (int i = 0; i < n; i++) {
            cout << 1;
            if (i != n - 1) {
                cout << " ";
            }
            if (i == n-1 && z != 0) {
                cout << " ";
            }
        }

        for (int i = 0; i < z; i++) {
            cout << 0;
            if (i != z -1) {
                cout << " ";
            }
        }
        cout << endl;
    }
}
