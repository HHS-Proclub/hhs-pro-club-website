#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int N, D;
int numbers[105];
int pSum[105];
int outcome[2] = {-1,1};
vector<int> poss;
int ans;

int main() {
    int numC;
    cin >> numC;

    for (int num = 0; num < numC; num++) {
        cin >> N >> D;
        poss.clear();
        ans = 0;
        for (int i = 0; i < N; i++) {
            cin >> numbers[i];
        }

        pSum[0] = outcome[numbers[0]%2];

        for (int i = 1; i < N; i++) {
            pSum[i] = pSum[i-1] + outcome[numbers[i]%2];
        }



        for (int i = 0; i < N-1; i++) {
            if (pSum[i] == 0) {
                poss.push_back(abs(numbers[i] - numbers[i+1]));
            }
        }

        sort(poss.begin(), poss.end());

        for (int i = 0; i < poss.size(); i++) {
            if (D-poss.at(i)>= 0) {
                ans++;
                D -= poss.at(i);
            } else {
                break;
            }
        }
        cout << ans << endl;;
    }
}
