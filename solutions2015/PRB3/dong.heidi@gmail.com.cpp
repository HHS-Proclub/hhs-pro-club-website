#include <iostream>

using namespace std;

int main() {
    int n;
    int x;
    int largest = 0;
    cin >> n;
    for (int i=0; i<n; i++) {
        cin >> x;
        if (x>largest) largest = x;
    }
    cout << largest << endl;
}

