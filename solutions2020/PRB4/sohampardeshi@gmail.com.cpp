#include <iostream>
#include <math.h>
using namespace std;


int main() {
	int t, j;
	cin >> t >> j;

	for(int i = 0; i < j; i++){
		cout << t * (i + 1) << endl;
	}

	return 0;
}
