#include <iostream>
using namespace std;

int main() 
{
	int N;
	cin>>N;
	int arr[1000];
	int x;
	int counter1=0;
	int counter2=1;
	int large;
	while(counter1<=N-1)
	{
		cin>>x;
		arr[counter1]=x;
		counter1++;
		x++;
	}
	large=arr[0];
	counter1=0;
	while(counter1<N)
	{
		if(arr[counter1]>large)
		{
			large=arr[counter1];
		}
		counter1++;
	}
	cout<<large<<endl;
}