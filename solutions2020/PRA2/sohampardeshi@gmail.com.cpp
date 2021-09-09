#include <iostream>
#include <fstream>
#include <string>
#include <math.h>
using namespace std;


int main() {
	int step, half, total, count = 0, dist = 0;
	cin >> step >> total;
	half = ceil(step / 2);

	while(dist + (step + half) < total){
		count += 2;
		dist += (step + half);
	}

	if(dist == total) cout << count << endl;
	else if(dist + step >= total) cout << count + 1 << endl;
	else cout << count + 2<< endl;

	return 0;
}
