#include <iostream>
#include <queue>
#include <algorithm>
using namespace std;

int sum[1000000];
int lengths[1000000];
int numCases;
int length, numPiece, value;
int ans;

int findMiddle(int x, int length) {
	int middle = x;
	int sumPortion = sum[x+length-1] - sum[x-1];
	int curDifference = abs((sumPortion - sum[middle])- (sum[middle]-sum[x-1]));
	int nextDifference = abs((sumPortion-sum[middle+1]) - (sum[middle+1] - sum[x-1]));
	while (nextDifference <= curDifference && middle +1 != x+length-1) {
		curDifference = nextDifference;
		middle++;
		nextDifference = abs(sumPortion-sum[middle+1] - (sum[middle+1]-sum[x-1]));
//		cout << x << " " << x+length-1 << " " << middle << ": " << curDifference << " " << nextDifference << endl;

	}
//	cout << curDifference << " " << nextDifference << " " << middle << endl;
	return middle;
}

void solve(int start, int length) {
	if (length > 1) {
		ans += sum[start+length-1]-sum[start-1];
		int midpoint = findMiddle(start, length);
		solve(start, midpoint-start+1);
		solve(midpoint+1, length - (midpoint-start+1));
	}
}

int main() {
	cin >> numCases;
	for (int numCase = 0; numCase < numCases; numCase++) {
		cin >> length >> numPiece;
		ans = value = 0;
		for (int i = 0; i < numPiece; i++) {
			cin >> lengths[i];
		}
		
		sort(lengths, lengths+numPiece);
		
		for (int i = 1; i <= numPiece; i++) {
			value += lengths[i-1];
			sum[i] = value;
		}
		solve(1, numPiece);
		
		cout << ans << endl;
	}
}
