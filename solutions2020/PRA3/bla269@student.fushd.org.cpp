#include <iostream>
#include <algorithm>
#include <set>
using namespace std;

int numCases;
int numValues;
int values[1000];
long long powers[32];
set <int> index;
int ans;

bool checkPower(long long x) {
	for (int i = 0; i < 32; i++) {
		if (x == powers[i]) {
			return true;
			break;
		}
	}
	return false;
}

int main() {
	powers[0] = 1;
	ans = 0;
	for (int i = 1; i < 32; i++) {
		powers[i] = powers[i-1] * 2;
	}
		cin >> numCases;
		
	for (int numCase = 0; numCase < numCases; numCase++) {
		cin >> numValues;
		for (int i = 0; i < numValues; i++) {
			cin >> values[i];
			index.insert(i);
		}
	
		
		for (int i = 0; i < numValues; i++) {
			for (int j = i+1; j < numValues; j++) {
				if (checkPower((long long) values[i] + (long long)values[j])) {
					index.erase(i);
					index.erase(j);
				}
			}
		}
		
		cout << index.size() << endl;
		
		index.clear();
	}
}


