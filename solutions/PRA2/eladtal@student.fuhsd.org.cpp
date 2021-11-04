#include<bits/stdc++.h>
#include<iostream>
using namespace std;

int main() {
    int times;
    cin >> times;
    for(int z=0;z<times;z++){
        long long  n;
    int m;
    scanf("%lld %d",&n,&m);
    long long v;
    int flag = 0;
    long long  vv;
    long long mid;
    long long left  = 0;
    long long right = n;
    long long ans = n;
    while(left <= right) {
        mid = (left + right) / 2;
        long long  sum = mid;
        int count = 0;
        long long v = m;
        int vv = mid/v;
        while(vv){
            sum += vv;
            count++;
            v = v*m;
            vv = mid/v;
        }
        if(flag == 1) break;
        if(sum >= n) {

            ans = min(ans,mid);
            right = mid - 1;
            ans = min(ans,mid);
        } else {
            left = mid + 1;
        }
    }
    printf("%lld\n",ans);
    }

    return 0;
}
