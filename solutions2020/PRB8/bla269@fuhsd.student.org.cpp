#include <iostream>
using namespace std;
int numCases, numCube;
int cube[3][6];
int able[1000];
int value, x;
int main () {
	cin >> numCases;
	for (int cases = 0; cases < numCases; cases++) {
		cin >> numCube;
		x = 1;
		for (int i = 0; i < 1000; i++) {
			able[i] = false;
		}
		for (int i = 0;  i < numCube; i++) {
			for (int j = 0; j < 6; j++) {
				cin >> cube[i][j];
			}
		}
		if (numCube >= 1) {
			for (int i = 0; i < 6; i++) {
				value = cube[0][i];
				able[value] = true;
				if (numCube >= 2) {
					value = cube[1][i];
					able[value] = true;
				}
				if (numCube>=3) {
					value = cube[2][i];
					able[value] = true;
				}
			}
		}
		
		if (numCube >= 2) {
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					value = (10*cube[0][i]) + (cube[1][j]);
					able[value] = true;
					value = (10*cube[1][i]) + (cube[0][j]);
					able[value] = true;
					if (numCube >= 3) {
						value = (10*cube[2][i]) + (cube[1][j]);
						able[value] = true;
						value = (10*cube[2][i]) + (cube[0][j]);
						able[value] = true;
						value = (10*cube[1][i]) + (cube[2][j]);
						able[value] = true;
						value = (10*cube[0][i]) + (cube[2][j]);
						able[value] = true;
					}
				}
			}	
		}
		if (numCube >= 3) {
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					for (int k = 0; k < 6; k++) {
						value = (100*cube[0][i]) + (10*cube[1][j]) + (cube[2][k]);
						able[value] = true;
						value = (100*cube[0][i]) + (10*cube[2][j]) + (cube[1][k]);
						able[value] = true;
						value = (100*cube[1][i]) + (10*cube[0][j]) + (cube[2][k]);
						able[value] = true;
						value = (100*cube[1][i]) + (10*cube[2][j]) + (cube[0][k]);
						able[value] = true;
						value = (100*cube[2][i]) + (10*cube[0][j]) + (cube[1][k]);
						able[value] = true;
						value = (100*cube[2][i]) + (10*cube[1][j]) + (cube[0][k]);
						able[value] = true;
					}
				}
			}
		}	
		while (able[x]) {
			x++;
		}
		cout << x-1 << endl;
	}
}
