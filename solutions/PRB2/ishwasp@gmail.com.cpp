#include<bits/stdc++.h>
#define ll long long int
#define f first
#define s second
#define pb push_back
const int MAX_N = 1e5 + 1;
const ll MOD = 1e9 + 7;
const ll INF = 1e9;
using namespace std;
void solve() {
 string s;
   //getline(cin,s);
 int n=3;
 int a[1001];
 memset(a,0,sizeof(a));
 for(int j=0;j<n;j++)
 {
 	getline(cin,s);
 	for(int i=0;i<s.size();i++)
 	{	 
 	if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
 	{
 		a[j]++;
	 }
  }
 }
 if(a[0]==5&&a[1]==7&&a[2]==5)
 cout<<"YES";
 else
 cout<<"NO";
}
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	solve();
 
}