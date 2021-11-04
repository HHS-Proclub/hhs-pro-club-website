#include <iostream>
#include <queue>

int main() {
	int t;
	std::cin >> t;
	for(int i = 0; i < t; i++) {
		std::priority_queue<int> a;
		int n;
		std::cin >> n;
		for(int j = 0; j < n; j++) {
			int a_j;
			std::cin >> a_j;
			a.push(a_j);
		}
		int s = 0;
		int x = 0;
		while(a.size() > 0) {
			int a_j = a.top();
			s += a_j * x + 1;
			a.pop();
			x++;
		}
		std::cout << s << std::endl;
	}
	return 0;
}
