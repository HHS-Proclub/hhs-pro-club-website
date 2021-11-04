#include <iostream>
#include <vector>
#include <algorithm>
#include <cstring>

using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int T;
    cin >> T;
    ++T;
    while (--T) {
        int n, k;
        cin >> n >> k;

        vector<pair<long long, long long>> songs;
        for (int i = 0; i < n; ++i) {
            long long t, b;
            cin >> t >> b;
            songs.emplace_back(b, t);
        }

        if (k == 1) {
            long long maxLen = 0;
            for (int i = 0; i < n; ++i) {
                maxLen = max(maxLen, songs[i].first * songs[i].second);
            }
            cout << maxLen << '\n';
        } else {
            sort(songs.begin(), songs.end());

            long long ans = songs[n - 1].first * songs[n - 1].second;
            long long maxLen[k];
            memset(maxLen, 0, sizeof maxLen);
            int K = k - 1;
            int end = n - k - 1;
            for (int i = n - 1; i > end; --i) {
                ans = max(ans, songs[i].first * (maxLen[K] + songs[i].second));
                for (int j = K; j > 1; --j) {
                    if (maxLen[j - 1] == -1) {
                        continue;
                    }
                    maxLen[j] = max(maxLen[j], maxLen[j - 1] + songs[i].second);
                }
                maxLen[1] = max(maxLen[1], songs[i].second);
            }
            for (int i = end; i >= 0; --i) {
                ans = max(ans, songs[i].first * (maxLen[K] + songs[i].second));
                for (int j = K; j > 1; --j) {
                    maxLen[j] = max(maxLen[j], maxLen[j - 1] + songs[i].second);
                }
                maxLen[1] = max(maxLen[1], songs[i].second);
            }


            cout << ans << '\n';
        }
    }

    return 0;
}