#include <iostream>

using namespace std;

int arr[] = {0, 0};
string nr[] = {"ash", "brock"};

void c(int n, int player) {
	if (n < 0) 
		return;
	if (n == 0) 
		arr[1-player]++;
	if ((n-1) % 3 == 0 || n % 3 == 0) {
		c(n-1, 1-player);
		c(n-4, 1-player);
	}
	if ((n-2) % 3 == 0 || n % 3 == 0)
		c(n-2, 1-player);
}

int main() {
	int N;
	string name;
	cin >> N >> name;
	c(N, (int)(name != "ash")); //ash = 0, brock = 1
	int wind = (arr[0] == 0) ? 1 : 0;
	cout << nr[wind] << " " << arr[wind] << endl;
	return 0;
}