#include<iostream>
using namespace std;

int main() {
	int a, b;
	cin >> a >> b;
	int gcd = a;
	if(a > b) gcd = b;
	gcd /= 2;
	if(gcd < a) gcd = a;
	if(gcd < b) gcd = b;
	while(gcd != 0) {
		if((a % gcd == 0) && (b % gcd == 0)) break;
		gcd--;
	}
	cout << gcd << endl;
}