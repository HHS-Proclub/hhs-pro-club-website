#include<iostream>;
#include<math.h>;


using namespace std;

int main() {
	double m = 0;
	double n= 0;
	int r = 0;

	cin >> m;
	cin >> n;
	cin >> r;

	double xHigh = floor(m + r);
	double xLow = floor(m - r);
	double yHigh = floor(n + r);
	double yLow = floor(n - r);

	//int *points = new int[(xHigh - xLow) * (yHigh - yLow)];
	int count = 0;
	for(int i = xLow; i <= xHigh; i++) {
		for(int j = yLow; j <= yHigh; j++) {
			if(sqrt(pow(i - m, 2) + pow(j - n, 2)) <= r) count++;
		}
	}
	cout << count << endl;
}