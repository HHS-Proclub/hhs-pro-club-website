#include <iostream>

using namespace std;

bool digitsAreDistinct(int num) {
    int digits[4];
    for (int i = 0; i < 4; i++) {
        digits[i] = num % 10;
        num /= 10;
    }
    for (int i = 0; i < 3; i++) {
        for (int j = i + 1; j < 4; j++) {
            if (digits[i] == digits[j]) return false;
        }
    }
    return true;
}

int main() {

    int n;
    cin >> n;
    int years[n];
    for (int i = 0; i < n; i++) {
        cin >> years[i];
        bool found = false;
        int check = years[i];
        while (!found) {
            ++check;
            if (digitsAreDistinct(check)) found = true;
        }
        cout << check << endl;
    }

}
