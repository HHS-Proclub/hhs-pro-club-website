#include <iostream>
#include <cstdio>

#include <cassert>

using namespace std;

const int MAXN = 1e3 + 100;
int a[MAXN], N, T, ans;
bool u[MAXN];

bool pow2(int n) {
    assert(n > 0);
    if(n == 1) return false;
    while(!(n&1)) n >>= 1;
    return !(n >> 1);
}

int main() {
    scanf("%d", &T);
    
    for(int t = 0;t < T;t++) {
        scanf("%d", &N);
        ans = 0;
        for(int i = 0;i < N;u[i++] = true) scanf("%d", a + i);
        for(int i = 0;i < N;i++) {
            bool p = false;
            for(int j = 0;j < N;j++) if(i != j and u[j] and pow2(a[i] + a[j])) {p = true; break;}
            if(!p) ans++, u[i] = false;
        }
        printf("%d\n", ans);
    }
    return 0;
}