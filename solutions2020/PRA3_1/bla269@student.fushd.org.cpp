#include <iostream>
#include <queue>
using namespace std;

priority_queue <int> values;
int numCases;
int length, numPiece, value1, value2;
int ans;

int main() {
	cin >> numCases;
	for (int numCase = 0; numCase < numCases; numCase++) {
		cin >> length >> numPiece;
		ans = 0;
		for (int i = 0; i < numPiece; i++) {
			cin >> value1;
			values.push(-value1);
		}
		
		while (values.size()>1) {
			value1 = values.top();
			values.pop();
			value2 = values.top();
			values.pop();
			ans += -(value1+value2);
			values.push(value1+value2);
		}
		values.pop();
		cout << ans << endl;	
	}
}
