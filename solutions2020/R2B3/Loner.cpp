#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;
	
	for (int i = 0; i < n; i++) {
		int length;
		cin >> length;
		
		int counter = 0;
		
		for (int j = 0; j < length-1; j++) {
			counter += (j+1) * (j+1);	
		}
		
		cout << counter << endl;
	}
	return 0;
}