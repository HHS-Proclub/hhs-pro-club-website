#include <cstdio>
#include <iostream>

#include <cassert>

using namespace std;

const int MAXN = 1e6 + 1000;
const int PiN = 9e4;

int p[PiN], ps;

bool prime(int n) {
    int l = -1, h = ps - 1;
    while(h > l + 1) {
        int m = (h + l)/2;
        if(n > p[m]) l = m;
        else h = m;
    }
    return p[h] == n;
}

int rev(int n) {
    int ret = 0;
    while(n > 0) {
        ret = ret * 10 + n%10;
        n = n/10;
    }
    return ret;
}

int N, a, b;

int main() {
    
    p[0] = 2;
    ps = 1;
    
    for(int i = 3;i < MAXN;i+= 2) {
        bool pr = true;
        for(int j = 1;j < ps and p[j]*p[j] <= i;j++) {
            if(i%p[j] == 0) {
                pr = false;
                break;
            }
        }
        if(pr) p[ps++] = i;
    }
    
    scanf("%d", &N);
    for(int i = 0;i < N;i++) {
        scanf("%d", &a);
        b = rev(a);
        if(a != b and prime(a) and prime(b)) printf("YES\n");
        else printf("NO\n");
    }
    
    return 0;
}