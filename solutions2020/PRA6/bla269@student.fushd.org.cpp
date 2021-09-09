#include <iostream>
#include <algorithm>
using namespace std;

int numCases;

int width, power;

int stones[10000];

int sum, minValue;

int main() {
	cin >> numCases;
	for (int numCase = 0; numCase < numCases; numCase++) {
		cin >> width >> power; 
		
		for (int i = 0; i < width-1; i++) {
			cin >> stones[i];	
		}
		sum = 0;
		for (int i = 0; i < power; i++) {
			sum += stones[i];
		}
		
		
		minValue = sum;
        for (int i = power; i < width - 1; i++) {
            sum = sum - stones[i - power] + stones[i];
            minValue = min(minValue, sum);
        }
		
		cout << minValue << endl;
	}
}
