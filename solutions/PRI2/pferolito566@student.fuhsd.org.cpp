#include <iostream>
using namespace std;

int main(){
	int numTests;cin>>numTests;
	for(int i=0;i<numTests;i++){
		string thing;
		cin>>thing;
		int modifier=0;
		int count=0;
		for(int j=0;j<thing.length();j++){
			if((int)(thing.at(thing.length()-j-1))+modifier==49){
				if(j<thing.length()-1){
					modifier=1;
					count+=2;
				}else{
					modifier=0;
				}
			}else if(((int)thing.at(thing.length()-j-1))+modifier==50){
				if(j<thing.length()-1){
					modifier=1;
				}else{
					modifier=0;
				}
				count+=1;
			}else{
				modifier=0;
				count++;
			}
		}
		cout<<count+modifier<<endl;
	}
	
	return 0;
}
