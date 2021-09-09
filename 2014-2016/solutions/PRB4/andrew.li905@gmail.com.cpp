#include <iostream>
using namespace std;

int main() 
{
	int x;
	int sum=0;
	int counter=1;
	long long product=1;
	while(counter<=4)
	{
		cin>>x;
		sum+=x;
		counter++;
	}
	while(sum>0)
	{
		product*=sum;
		sum--;
	}
	cout<<product<<endl;
}