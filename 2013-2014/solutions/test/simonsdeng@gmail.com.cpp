#include <iostream>
using namespace std;

int main() {
	string s;
	int sum = 0;
	
	cin >> s;
	sum += stoi(s);
	
	cin >> s;
	sum += stoi(s);
	
	cout << sum;
}