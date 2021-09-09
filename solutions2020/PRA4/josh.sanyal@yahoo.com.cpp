#include <iostream>
#include <cstdio>
#include <string>
#include <fstream>

using namespace std;

const int MAXN = 1010000;
const int MAXK = MAXN;

int N, K;

string n, k;
int z[MAXN + MAXK];

char g(int v) {
    if(v < k.size()) return k[v];
    if(v == k.size()) return ((char) 96);
    return n[v - k.size() - 1];
}

int main() {
    int hi;
    cin >> hi;
    for(int wow = 0; wow < hi; wow++) {
        cin >> n >> k;
        N = n.size(), K = k.size();
        int p = -1;
        z[0] = -1;
        int ans = -1;
        for(int c = 1;c <= N + K;c++) {
            while(p != -1 and g(c) != g(p + 1)) p = z[p];
            if(g(p + 1) == g(c)) p++;
            if(p == K - 1) {
                ans = c - 2 * K + 1;
                break;
            }
            z[c] = p;
        }
        cout << n.length() << endl << k.length() << endl;
    }
    return 0;
    
}