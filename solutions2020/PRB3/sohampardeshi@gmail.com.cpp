#include <iostream>
#include <math.h>
using namespace std;



void factors(int x){
	for(int i = 1; i <= x; i++)
		if(x % i == 0)	cout << i << endl;
}

int main() {
	int cases;
	cin >> cases;

	for(int i = 0; i < cases; i++){
		int temp;
		cin >> temp;
		factors(temp);
	}

	return 0;
}
