#include <iostream>
#include <math.h>

using namespace std;

bool isPrime (int n){
	if (n == 1 || n == 0){
		return false;
	}
	
	for (int i = 0; i < n / 2 + 1; i ++){
		if (i != 0 && i != 1 && n % i == 0){
			return false;
		}
	}
	
	return true;
}

int getSumOfPrimes (int i){
	int s = 0;
	int j;
	for (j = 0; j < i; j++){
		if (s == 0){
			if (isPrime(j)){
				s = s + j;
			}
		}else{
			if (isPrime(j)){
				s = s * j;
			}
		}
	}
	return s;
}

int baseConversion (int n){
	int x = 0;
	int y;
	int z = 0;
	
	while (n > 0){
		y = n % 8;
		x += y * pow(10, z);
		z ++;
		
		n = n / 8;
	}
	
	return x;
}

int main () {
	int j;
	
	cin >> j;
	
	cout << baseConversion(getSumOfPrimes(j));
	
	return 0;
}
