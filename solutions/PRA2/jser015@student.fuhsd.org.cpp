#include <iostream>
using namespace std;

void solve();
int binarySearch(int n, int k);
bool isVBigEnough(int n, int v, int k);

int main() {
	int numTestCases{ 0 };
	cin >> numTestCases;

	for (int i = 0;i < numTestCases;i++) {
		solve();
	}
}

void solve() {
	unsigned int n{ 0 };
	int k{ 0 };

	cin >> n >> k;

	cout << binarySearch(n, k) << endl;
}

int binarySearch(int n, int k) {
	int min{ 0 };
	int max{ n };
	int mid{ -1 };

	int output{ -1 };

	while (min <= max) {
		mid = (max + min) / 2;

		if (isVBigEnough(n, mid, k)) {
			output = mid;
			max = mid - 1;
		}
		else {
			min = mid + 1;
		}
	}

	return output;
}

bool isVBigEnough(int n, int v, int k) {
	int sum = 0;
	for (int i = v;i > 0;i/=k) {
		sum += i;
	}

	if (sum >= n) {
		return true;
	}
	return false;
}