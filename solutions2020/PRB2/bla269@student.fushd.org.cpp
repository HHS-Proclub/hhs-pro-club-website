#include <iostream>
#include <algorithm>
using namespace std;

int numCases;
int n, d;
double x,y;
int numCrickets;
pair<double, double> corners[4];

int main() {
	

	cin >> numCases;
	for (int numCase = 0; numCase < numCases; numCase++) {
		cin >> n >> d >> numCrickets;
		for (int numCricket = 0; numCricket < numCrickets; numCricket++) {
			cin >> x >> y;
			if (y < -x + d || y < x - d || y > -x + 2*n - d || y > x + d) {
				cout << "NO" << endl;
			} else {
				cout << "YES" << endl;
			}
		}
    } 
}
