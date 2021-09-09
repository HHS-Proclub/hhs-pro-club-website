#include <iostream>
#include <algorithm>
using namespace std;

int dx[] = {0,0,1,-1};
int dy[] = {-1,1,0,0};

int numCases;

int l, w;
int grid[1000][1000];
int horizontal[2][1000];
int vertical[2][1000];
long long num;

int main() {
	
	cin >> numCases;
	
	for (int numCase = 0; numCase < numCases; numCase++) {
		cin >> w >> l;
		
		num = 0;
		fill(horizontal[0], horizontal[0]+w,-1);
		fill(vertical[0], vertical[0]+l, -1);
		fill(horizontal[1], horizontal[1]+w,-1);
		fill(vertical[1], vertical[1]+l, -1);
				
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < l; j++) {
				cin >> grid[i][j];
				if (grid[i][j] == 1) {
					if (horizontal[0][i] == -1) {
						horizontal[0][i] = j;
					}
					horizontal[1][i] = j;
					if (vertical[0][j] == -1) {
						vertical[0][j] = i;
					}
					vertical[1][j] = i;
				}
			}
		}
		
//		for (int i = 0; i < l; i++) {
//			cout << vertical[0][i] << " " << vertical[1][i] << endl;
//		}
		
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < l; j++) {
				if (grid[i][j] == 0) {
					if (j > horizontal[0][i] && horizontal[0][i] != -1) {
						num++;
					}
					if (j < horizontal[1][i] && horizontal[1][i] != -1) {
						num++;
					}
					if (i > vertical[0][j] && vertical[0][j] != -1) {
						num++;
					}
					if (i < vertical[1][j] && vertical[1][j] != -1) {
						num++;
					}
				}
			}
		}
		
		cout << num << endl;
		
	}
}
