#include <algorithm>
#include <iostream>
#include <string>

using namespace std;

int n, x, y, z, f1[110], f2[110];

int main() {
    
    cin >> n >> x >> y >> z;
    
    for (int i = 0; i < n; i++) {
        cin >> f1[i] >> f2[i];
    }
    
    for (int i = 0; i <= f1.length; i++) {
        for (int j = 0; j <= s2.length(); j++) {
            if (i == 0 || j == 0) {
                dp[i][j] = 0;
            }
            else {
                dp[i][j] = dp[i-1][j-1] + 1;
                if (s1[i-1] == s2[j-1]) {
                    dp[i][j] = min(dp[i][j], dp[i-1][j-1]);
                }
                dp[i][j] = min(dp[i][j], dp[i-1][j] + 1);
                dp[i][j] = min(dp[i][j], dp[i][j-1] + 1);
            }
        }
    }
    
    cout << dp[s1.length()][s2.length()] << endl;
 
}