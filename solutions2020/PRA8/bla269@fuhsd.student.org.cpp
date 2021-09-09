#include <iostream>
#include <algorithm>
using namespace std;
int numCases;
int cube[6][4];
int a[4];
int s1, s2;
int num;
bool solvable = true;
int side[6];
int same() {
	if (a[0] == a[1] && a[2] == a[3]) {
		if (a[1] == a[2]) {
			return 3;
		} else {
			return 1;
		}
	}
	else if (a[0] == a[2] && a[1] == a[3]) {
		return 2;
	} else {
		return 0;
	}
}
int main () {
	cin >> numCases;
	for (int cases = 0; cases < numCases; cases++) {
		s1 = 0;
		s2 = 0;
		num = 0;
		solvable = true;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				cin >> cube[i][j];
				a[j] = cube[i][j];
			}
			if (same() == 0) {
				solvable = false;
			} 
			else if (same() == 3) {
				if (s1 == 0) {
					s1 = i+1;
				} else {
					s2 = i+1;
				}
			}
			else if (same() == 1) {
				side[num] = 2;
				num++;
			} else {
				side[num] = 3;
				num++;
			}
		}
		if (s1 == 1 && s2 == 3) {
			for (int i = 0; i < 4; i++) {
				if (side[i] != 2) {
					solvable = false;
				}
			}
		}
		else if (s1 == 4 && s2 == 5) {
			for (int i = 0; i < 2; i++) {
				if (side[i] != 2) {
					solvable = false;
				}
			}
			for (int i = 2; i < 4; i++) {
				if (side[i] != 3) {
					solvable = false;
				}
			}
		}
		else if (s1 == 2 && s2 == 6) {
			for (int i = 0; i < 4; i++) {
				if (side[i] != 3) {
					solvable = false;
				}
			}
		} else {
			solvable = false;
		}
		if (solvable) {
			cout << "YES" << endl;
		} else {
			cout << "NO" << endl;
		}
	}
}
