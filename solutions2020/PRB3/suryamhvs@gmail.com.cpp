#include<iostream>
#include<string>
#include<algorithm>
#include <stdio.h>
#include <string.h>
#include <vector>
using namespace std;
vector< int > vectorarray;
int x,num = 0;
void swap(char *x, char *y)
{
  char temp;
  temp = *x;
  *x = *y;
  *y = temp;
}

/* Function to print permutations of string
This function takes three parameters:
1. String
2. Starting index of the string
3. Ending index of the string. */
void permute(char *a, int l, int r)
{
  int i;
  if (l == r)
  {
    printf("%s \n", a);

  }
  else
  {
    for (i = l; i <= r; i++)
    {
      swap((a+l), (a+i));
      permute(a, l+1, r);
      swap((a+l), (a+i)); //backtrack
    }
  }
}

int production(int num)
{
  string numConvString = to_string(num);

  for(int j = 0;j<sizeof(numConvString);j++)
  {
    for(int i = 0;i<4;i++)
    {
      if(i==0)
      numConvString=numConvString+numConvString.at(j);
      else if(i==1)
      numConvString=numConvString.at(j)+numConvString;
      else if(i==2)
      numConvString=numConvString+numConvString.at(j)+numConvString.at(j);
      else if(i==3)
      numConvString=numConvString.at(j)+numConvString.at(j)+numConvString;
      char tab2[1024];
      strncpy(tab2, numConvString.c_str(), sizeof(tab2));
      tab2[sizeof(tab2) - 1] = 0;
      int stringlen = strlen(tab2);
      permute(tab2, 0, stringlen-1);
    }

  }

}

/* Driver program to test above functions */
int main()
{
  cin>>x;
  int trump[x];
  for(int i = 0;i<x;i++)
  {
    cin>>num;
    production(num);
  }

}
