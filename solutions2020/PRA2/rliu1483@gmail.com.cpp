#include <bits/stdc++.h>
using namespace std;

bool is_prime(int p) {
    if(p%2==0 && p!=2)
	    return false;
    int cur = 3;
    while(cur <= sqrt(p)) {
        if(p%cur==0)
		return false;
        cur += 2;
    }
    return true;
}

int r(int n) {
    string s1 = to_string(n);
    string ans = "";
    for(int i=s1.size()-1; i>=0; i--)
        ans += s1[i];
    return stoi(ans);
}

int main() {
    cin.tie(0);
    ios::sync_with_stdio(0);

    int n;
    cin >> n;
    for(int i=0; i<n; i++) {
        int p;
	cin >> p;
        int rev = r(p);
        if(p != rev && is_prime(p) && is_prime(rev))
            cout << "YES" << '\n';
        else
            cout << "NO" << '\n';
    }

    return 0;
}
