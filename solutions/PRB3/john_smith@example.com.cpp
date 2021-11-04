#include <iostream>
#include <vector>

int main() {
	int t;
	std::cin >> t;
	for(int i = 0; i < t; i++) {
		int m, n;
		std::cin >> n >> m;
		int *c = new int[n];
		for(int j = 0; j < n; j++) {
			std::cin >> c[j];
		}
		std::vector<int> *a = new std::vector<int>[n];
		for(int j = 0; j < m; j++) {
			int f, t;
			std::cin >> f >> t;
			a[f - 1].push_back(t - 1);
			a[t - 1].push_back(f - 1);
		}
		int *l = new int[n];
		int *li = new int[n];
		for(int j = 0; j < n; j++) {
			l[j] = j;
			li[j] = j;
		}
		int s = n;
		int r = 0;
		while(s > 0) {
			std::vector<int> h;
			h.push_back(l[0]);
			int e = c[l[0]];
			while(h.size()) {
				int t = h.back();
				h.pop_back();
				if(s-- > 0) {
					l[li[t]] = l[s];
					li[l[s]] = li[t];
					li[t] = -1;
				}
				if(c[t] < e) {
					e = c[t];
				}
				for(int j = 0; j < a[t].size(); j++) {
					if(li[a[t][j]] < 0) {
						continue;
					}
					h.push_back(a[t][j]);
				}
			}
			r += e;
		}
		std::cout << r << std::endl;
		delete[] c;
		delete[] a;
		delete[] l;
		delete[] li;
	}
}