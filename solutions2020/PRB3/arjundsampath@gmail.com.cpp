#include <iostream>
using namespace std;

int main() {
    int a;
    cin >> a;
    int num;
    for(int x =1; x<=a; x++){
        cin >> num;
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                cout << i << "\n";
            }
        }
    }
    return 0;
}
