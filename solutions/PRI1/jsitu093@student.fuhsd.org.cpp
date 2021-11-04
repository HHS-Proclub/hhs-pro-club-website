#include <iostream>
#include <math.h>
#include <string>
#include <algorithm>
#include <fstream>
#include <map>
#include <vector>
#include <deque>
#include <utility>

using namespace std;

int main() {
	int n;
	cin >> n;

	int a[n];

	for (int i = 0; i < n; i++){
		int temp1;
		int temp2;
		cin >> temp1 >> temp2;
		a[i] = temp1 + temp2;
	}


	for (int i = 0; i < n; i++){
		cout << a[i] << endl;
	}

}