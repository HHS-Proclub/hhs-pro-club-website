#include<iostream>
using namespace std;
int main()
{
  int x,n,count,sum=0;
  cin>>x;
  int hola[x];
  //cout<<x;
  for(int i = 0;i<x;i++)
  {
    count=0;
    sum=0;
    n=0;
    cin>>n;
    if(n==1)
    hola[i]=1;
    else if(n==0)
    hola[i]=0;
    else
    {
      while(sum<=n)
      {
        count+=1;
        sum+=count;
      }
      hola[i]=count-1;
    }
  }
  for(int a = 0;a<x;a++)
  {
    cout<<hola[a]<<"\n";
  }
}
