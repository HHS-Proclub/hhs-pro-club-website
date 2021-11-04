#include <iostream>
using namespace std;

long gcd(long a,long b){
	while(a>0 && b>0){
		if(a>b){
			a%=b;
		}else{
			b%=a;
		}
	}
	return a+b;
}

int main(){
	int n;cin>>n;
	for(int b=0;b<n;b++){
		long a;cin>>a;
		int count=0;
		string n=to_string(a);
		for(int i=0;i<n.length();i++){
			count+=n.at(i);
			count-=48;
		}
		while(gcd(a,count)<=1){
			a++;
			count=0;
			n=to_string(a);
			for(int i=0;i<n.length();i++){
				count+=n.at(i);
				count-=48;
			}
		}
		cout<<a<<endl;
	}
	return 0;
}
