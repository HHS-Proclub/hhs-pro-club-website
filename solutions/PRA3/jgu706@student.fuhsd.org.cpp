#include <iostream>
#include <algorithm>
#include <queue>

int main() {
	int t;
	std::cin >> t;
	for(int i = 0; i < t; i++) {
		int n, k;
		std::cin >> n >> k;
		int *t = new int[n];
		int *b = new int[n];
		int *s = new int[n];
		for(int j = 0; j < n; j++) {
			std::cin >> t[j] >> b[j];
			s[j] = j;
		}
		std::sort(s, s + n, [b](int i, int j) {
			return b[i] < b[j];
		});
		std::priority_queue<int> h;
		int l = 0;
		long r = -1;
		long a = 0;
		for(int j = n - 1; j >= 0; j--) {
			long p = (a + t[s[j]]) * b[s[j]];
			if(r < p) {
				r = p;
			}
			if(k - 1 > 0) {
				if(h.size() >= k - 1) {
					if(t[s[j]] < h.top()) {
						continue;
					}
					a -= h.top();
					h.pop();
				}
				a += t[s[j]];
				h.push(t[s[j]]);
			}
		}
		std::cout << r << std::endl;
		delete[] t;
		delete[] b;
		delete[] s;
	}
}