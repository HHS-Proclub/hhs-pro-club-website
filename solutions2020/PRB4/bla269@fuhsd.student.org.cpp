#include <iostream>
#include <algorithm>
using namespace std;
int main(){
	int z;
	cin >>z;
	for (int j = 0; j < z;j++){
		int a, b, c, mA=0, mB=0,m,x,y,A[1000000],B[1000000],nA,nB;
		long long ans=0;
		cin >> a>>b>>c>>m;
		for (int i = 0; i < m; i++){
			cin >>x>>y;
			if (y ==0){
				A[mA] = x;
				mA++;
			}
			else{
				B[mB]=x;
				mB++;
			}
		}
		sort(A,A+mA);
		sort(B,B+mB);
		nA= mA;
		nB=mB;
		mA = 0;
		mB = 0;
		for (int i = 0; i < a; i++){
			if (i < nA){
				ans+= A[i];
				mA++;
			}
		}
		for (int i = 0; i < b; i++){
			if(i<nB){
				ans+= B[i];
				mB++;
			}
		}
		x=mA;
		y = mB;
		for (int i = 0; i < c; i++){	
			if (i < nA+nB-x-y){
			    if (nA<=mA){
			        ans+=B[mB];
			        mB++;
			    }
			    else if(nB<=mB){
			        ans+=A[mA];
			        mA++;
			    }
				else if (A[mA] < B[mB]){
					ans+=A[mA];
					mA++;
				}
				else{
					ans+=B[mB];
					mB++;
				}
			}
		}
		cout << mA + mB<<" "<<ans <<endl;;
	}
}
