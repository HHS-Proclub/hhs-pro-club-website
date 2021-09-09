#include <iostream>
#include <vector>

using namespace std;

int N, path = 0;

void go(vector<vector<int> > x, int r, int c) {
	if (r == N-1 && c == N-1) {
		path++;
		return;
	}
	if (r < 0 || c < 0 || r >= N || c >= N || x[r][c] == 1)
		return;
	x[r][c] = 1;
	go(x, r-1, c);
	go(x, r+1, c);
	go(x, r, c-1);
	go(x, r, c+1);
}

int main() {
	cin >> N;
	vector<vector<int> > v(N, vector<int>(N));
	for (int i = 0; i < N; i++)
		for (int j = 0; j < N; j++)
			cin >> v[i][j];
	go(v, 0, 0);
	cout << path << endl;
	return 0;
}