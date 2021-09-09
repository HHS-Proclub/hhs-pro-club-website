#include <iostream>
#include <array>

int n;
bool e = false;

int main() {
  std::cin >> n;
  int a[n];
  for (int i = 0; i < n; i++) {
    std::cin >> a[i];
  }
  for (int i = 0; i < n; i++) {
    int y = a[i];
    y++;
    int a = y%10000/1000;
    int b = y%1000/100;
    int c = y%100/10;
    int d = y%10/1;
    
		
		for (int i = 0; i < 1000; i++) {
    	if ((a != b) && (b != c) && (c != d) && (a != d) && (a != c) && (d != b)) {
      	std::cout << y << std::endl;
				i = 1000;
    	} else {
      	y++;
      	a = y%10000/1000;
      	b = y%1000/100;
      	c = y%100/10;
      	d = y%10/1;
			}
		}
  }
}