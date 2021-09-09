#pragma comment(linker, "/stack:200000000")
#pragma GCC optimize("Ofast")
#pragma GCC target("sse,sse2,sse3,ssse3,sse4,popcnt,abm,mmx,avx,tune=native")

#include <bits/stdc++.h>

using namespace std;

bool distinct(int y) {
    int th = y / 1000;
    int h = y / 100 % 10;
    int t = y / 10 % 10;
    int o = y % 10;
    set<int> s = {th, h, t, o};
    return s.size() == 4;
}

int main() {
    cin.tie(0);
    ios::sync_with_stdio(0);

    int n; cin >> n;
    for(int i=0; i<n; i++) {
        int y;
	cin >> y;
        ++y;
        while (!distinct(y)) {
            ++y;
        }

        cout << y << '\n';
    }

    return 0;
}
