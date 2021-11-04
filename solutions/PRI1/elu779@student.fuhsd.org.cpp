#include <iostream>
using namespace std;

int main(){
	int n, f1, f2;
	cin >> n;
	int sl[n];
	for(int i=0; i<n; i++){
		cin >> f1 >> f2;
		sl[i] = f1+f2;
	}

	for(int i=0; i<n; i++){
		cout<<sl[i]<<endl;
	}
}
