#include <iostream>
using namespace std;

int main() {
	int size = 0;
	cin >> size;
	int *offers = new int[size];

	for(int i = 0; i < size; i++) {
		cin >> offers[i]; 
	}

	int high = offers[0];
	int index = 0; 
	for(int i = 0; i < size; i++) {
		if(offers[i] > high) {
			high = offers[i];
			index = i;
		}
	}

	cout << high << endl;
	return 0;
}