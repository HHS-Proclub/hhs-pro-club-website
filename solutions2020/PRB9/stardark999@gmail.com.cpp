#include <iostream>
#include <vector>

using namespace std;

int maxlen = 1, k;
vector<int> num;

void gen(int x, int rem) {
    if (k < 0) return;
    if (x == maxlen) {
        if (rem != 0) return;
        k--;
        if (k == 0) {
            for (int i = 0; i < num.size(); i++) cout << num[i]; cout << endl;
        }
        return;
    }
    for (int i = (x == 0 ? 1 : 0); i <= min(rem, 9); i++) {
        num.push_back(i);
        gen(x + 1, rem - i);
        num.pop_back();
    }
}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        maxlen = 1; num.clear();
        cin >> k;
        while (k > 0) {
            gen(0, 10);
            maxlen++;
        }
    }
    return 0;
}
