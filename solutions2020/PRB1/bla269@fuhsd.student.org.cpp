// Example program
#include <iostream>
#include <string>
using namespace std;
int main()
{
  int a, b,c=0,d=0;
  cin>> a;
  for (int i = 0; i <a;i++){
      cin >> b;
      while (c < b-d){
          d++;
          c += d;
      }      
	      cout << d<<endl;

    }   
}
