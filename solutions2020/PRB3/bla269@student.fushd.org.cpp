#include <iostream>
#include <queue>
using namespace std;

priority_queue<int> values;
int numCases;
int length, numPiece, value;
int ans;

int main() {
	cin >> numCases;
	for (int i = 0; i < numCases; i++) {
		cin >> length >> numPiece;
		ans = 0;
		for (int j = 0; j < numPiece; j++) {
			cin >> value;
			values.push(value);
		}
		while (values.size()>1) {
			ans += length;
			length -= values.top();
			values.pop();
		}
		values.pop();
		cout << ans << endl;
	}
}
