#include <iostream>
#include <cmath>
using namespace std;

int main() {
	string good;
	string desired;
	cin >> good; 
	cin >> desired;
	
	int matches = 0;
	for(int i = 0; i < desired.size(); i++) {
		for(int j = 0; j < good.size(); j++) {
			if (desired[i]==good[j]) matches++;
		}
	}
	
	cout << good.size() + desired.size() - matches << endl;
	return 0;
}