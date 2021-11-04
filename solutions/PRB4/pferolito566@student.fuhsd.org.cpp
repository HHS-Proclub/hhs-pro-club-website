#include <iostream>
using namespace std;

int main(){
	int t;
	cin>>t;
	for(int cantTouch=0;cantTouch<t;cantTouch++){
		string word;
		cin>>word;
		int numLower=0;
		int numUpper=0;
		for(int i=0;i<word.length();i++){
			if(65<=(int)word.at(i) && (int)word.at(i)<=90){
				numUpper++;
			}else{
				numLower++;
			}
		}
		if(numUpper<=numLower){
			for(int i=0;i<word.length();i++){
				if(65<=(int)word.at(i) && (int)word.at(i)<=90){
					cout<<(char)((int)word.at(i)+32);
				}else{
					cout<<word.at(i);
				}
			}
			cout<<endl;
		}else{
			for(int i=0;i<word.length();i++){
				if(65<=(int)word.at(i) && (int)word.at(i)<=90){
					cout<<word.at(i);
				}else{
					cout<<(char)((int)word.at(i)-32);
				}
			}
			cout<<endl;
		}
	}
	return 0;
}
