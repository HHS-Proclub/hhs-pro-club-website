#include <iostream>
#include <fstream>
#include <string>
#include <math.h>

using namespace std;

bool solve(int ones, int fives, int total){
	while(fives > 0 && total > 5){
		fives--;
		total -= 5;
	}
	return total <= ones;
}

int main() {
	bool arr[5];
	for(int i = 0; i < 5; i++){
		int o, f, t;
		cin >> o >> f >> t;
		arr[i] = solve(o, f, t);
	}
	for(int i = 0; i < 5; i++) cout << (arr[i] ? "true" : "false") << endl;

	return 0;
}
