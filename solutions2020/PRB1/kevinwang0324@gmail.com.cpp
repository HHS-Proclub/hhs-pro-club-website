#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int nums[2*n];
    for (int i = 0; i < 2*n; i++) {
        cin >> nums[i];
        if (i % 2 == 1) cout << nums[i-1]+nums[i] << "\n";
    }
}
