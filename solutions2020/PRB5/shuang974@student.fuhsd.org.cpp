#include <iostream>
#include <cstdio>

using namespace std;

typedef long long ll;

int N, T;
const int MAXN = 1e6 + 100;
ll a[MAXN], v[2];

int main() {
    scanf("%d", &T);
    
    for(int t = 0;t < T;t++) {
        scanf("%d%lld%lld", &N, v, v + 1);
        for(int i = 0;i < N;i++) scanf("%lld", a + i);
        ll b = min(v[0], v[1]), ans = 0;
        for(int i = 0;i < N/2;i++) {
            if(a[i] == 2 and a[N - i - 1] == 2) ans+=b*2;
            if(a[i] != 2 and a[N - i - 1] == 2) ans+=v[a[i]];
            if(a[i] == 2 and a[N - i - 1] != 2) ans+=v[a[N - i - 1]];
            if(a[i] != 2 and a[N - i - 1] != 2) if(a[i] != a[N - i - 1]) {ans = -1; break;}
        }
        if(ans != -1 and N&1 and a[N/2] == 2) ans += b;
        printf("%lld\n", ans);
    }
}