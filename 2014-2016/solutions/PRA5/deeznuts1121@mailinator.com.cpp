#include <iostream>
#include <string>
#include <cmath>

using namespace std;

struct pt {
	int x, y;
};

int r, c, tcases;
pt j, t, tmom;

int d(int r1, int c1, int r2, int c2) {
	return abs(r2-r1) + abs(c2-c1);
}

int main() {
	cin >> r >> c >> tcases;
	for (int i = 0; i < tcases; i++) {
		cin >> j.y >> j.x >> t.y >> t.x >> tmom.y >> tmom.x;
		if (j.x-1 < min(d(t.y, t.x, j.y, 1), d(tmom.y, tmom.x, j.y, 1))
			|| c-j.x < min(d(t.y, t.x, j.y, c), d(tmom.y, tmom.x, j.y, c))
			|| j.y-1 < min(d(t.y, t.x, 1, j.x), d(tmom.y, tmom.x, 1, j.x))
			|| r-j.y < min(d(t.y, t.x, r, j.x), d(tmom.y, tmom.x, r, j.x)))
			cout << 1 << endl;
		else
			cout << 0 << endl;
	}
	return 0;
}