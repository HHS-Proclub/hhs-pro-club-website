#include <iostream>
using namespace std;

int main() {
    int b, a;
    cin >> b;
    int n [b];
    int k [b];
    for (int z = 0; z< b; z++) {
        cin >> n[z] >> k[z];
    }
    for (int t = 0; t <= b; t++) {
        int arr [n[t]];
        for(int i = 0; i < n[t]; i++){
            arr[i] = i;
            for(int y = 1; y < n[t]; y++){
                for(int x = 1; x <= k[t]; x++){
                    if(arr[x-1]%x != 0 || arr[x-1] <= x){
                        arr[x]=x;
                        break;
                    }
                }
                if(arr[y] != 0) {
                    a++;
                }
            }
        }
        
    }
    return a;
}
