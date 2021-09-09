#include <iostream>
#include <algorithm>
using namespace std;

int numCases;
int numDancers;
int cost[2];
bool possible;

int dancers[20];

int ans;
int main() {
	cin >> numCases;
	
	for (int numCase = 0; numCase < numCases; numCase++) {
		cin >> numDancers >> cost[0] >> cost[1];
		possible = true;
		ans = 0;
		
		for (int i = 0; i < numDancers; i++) {
			cin >> dancers[i];
		}
		
		for (int i = 0; i < numDancers/2; i++) {
			if (dancers[i] == dancers[numDancers-1-i]) {
				if (dancers[i] == 2) {
					ans += 2*min(cost[0],cost[1]);
				}
			}
			else if (dancers[i] == 2) {
				ans += cost[dancers[numDancers-1-i]];
			}
			else if (dancers[numDancers-1-i] == 2) {
				ans += cost[dancers[i]];
			}
			else {
				possible = false;
			}
		}
		
		if (numDancers%2==1 && dancers[numDancers/2] == 2) {
			ans += min(cost[0],cost[1]);
		}
		if (possible) {
			cout << ans << endl;
		} else {
			cout << -1 << endl;
		}
	}
}
