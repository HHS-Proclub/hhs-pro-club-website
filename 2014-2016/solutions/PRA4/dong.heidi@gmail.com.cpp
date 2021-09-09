#include <iostream>

using namespace std;

int n, fact;
void perm(char str[], char arr[], int ind);

int main() {
    cin >> n;
    fact = n;
    for (int i=n-1; i>0; i--) {
        fact *= i;
    }
    char str[n];
    for (int i=0; i<n; i++) {
        str[i] = 97+i;
    }
    char arr[n];
    perm(str, arr, 0);
}

void perm(char str[], char arr[], int ind) {
    if (ind==n) {
        for (int i=0; i<n; i++) {
            cout << arr[i];
        }
        cout << endl;
        return;
    }
    for (int i=0; i<n; i++) {
        if (str[i] != 0) {
            arr[ind] = str[i];
            str[i] = 0;
            perm(str, arr, ind+1);
            str[i] = arr[ind];
            arr[ind] = 0;
        }
    }
}
