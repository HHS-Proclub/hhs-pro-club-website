#include <cstdio>
#include <algorithm>

#define MAX_N 101000
#define MAX_C 1010000000
#define PRCSN 1000000000000000			//10^15

using namespace std;

int cases;
int N, C;
struct phone {
	int rate, chargeR;
	phone(int a, int b) {
		rate = a;
		chargeR = b;
	}
	phone() {
		phone(1, -1);
	}
} phones[MAX_N];

struct precd {
	long long number;
	long long decimal;
	
	precd(double f) {
		number = (long long) f;
		decimal = ((long long) (f*PRCSN))%PRCSN;
	}
	precd(long long a, long long b) {
		number = a;
		decimal = b;
	}
	precd() {
		precd(0.0);
	}
};

precd operator + (precd a, precd b) {
	precd ret = precd();
	ret.number = a.number+b.number;
	ret.decimal = a.decimal+b.decimal;
	
	int ol = 0;
	while(ret.decimal<0) {
		ol++;
		ret.decimal += PRCSN;
	}
	
	ret.number += (ret.decimal/PRCSN)-ol;
	ret.decimal = ret.decimal%PRCSN;
	
	//printf("%lld.%lld + %lld.%lld = %lld.%lld\n", a.number, a.decimal, b.number, b.decimal, ret.number, ret.decimal);
	
	return ret;
}

precd operator - (precd a, precd b) {
	return (a+precd(-b.number, -b.decimal));
}


precd operator * (precd a, long long b) {
	long long n = a.number;
	long long d = a.decimal;
	
	n = n*b;
	d = d*b;
	
	int ol = 0;
	while(d<0) {
		ol++;
		d += PRCSN;
	}
	
	n += (d/PRCSN)-ol;
	d = (d%PRCSN);
	
	return precd(n, d);
}


precd operator * (precd a, double b) {
	long long n = a.number;
	long long d = a.decimal;
	
	d = ((long long) d*b)+(((long long) ((n*PRCSN)*b))%PRCSN);
	n = n*b;
	
	int ol = 0;
	while(d<0) {
		ol++;
		d += PRCSN;
	}
	
	n += (d/PRCSN)-ol;
	d = (d%PRCSN);
	
	//printf("%lld.%lld*%f = %lld.%lld\n", a.number, a.decimal, b, n, d);
	
	return precd(n, d);
}

int main() {
	scanf(" %d", &cases);
	
	for(int caseN = 0;caseN<cases;caseN++) {
		scanf(" %d %d", &N, &C);
		for(int i = 0;i < N;i++) {
			int a, b;
			scanf(" %d %d", &phones[i].rate, &phones[i].chargeR);
		}
		
		sort(phones, phones+N, [](phone a, phone b){return ((((long long)a.chargeR)*b.rate < ((long long)b.chargeR)*a.rate));});
	
		precd ec = precd(0.0);
		long long cps = C;
		precd curt = precd(0.0);
		bool foundAnswer = false;
		
		for(int i = 0;i < N;i++) {
			if(phones[i].rate==0) {
				break;
			}
			
			precd tn = precd(phones[i].chargeR*1.0/phones[i].rate) - curt;
			
			if((ec+tn*cps).number<0) {
				foundAnswer = true;
				
				curt = curt - (ec*(1.0/cps));
				break;
			} else {
				ec = (ec+tn*cps);
				curt = curt + tn;
				
				cps -= phones[i].rate;	
			}
		}
		
		if(!foundAnswer) {
			curt = curt - (ec*(1.0/cps));
		}
		
		printf("%lld.", curt.number);
		
		long long curtdec = curt.decimal;
		if((curtdec%1000000)/100000 >= 5) {
			curtdec += 100000;
		}
		curtdec = curtdec/100000;
		
		long long precis = PRCSN/(10*100000);
		while((precis >= 10)&&(curtdec/precis == 0)) {
			printf("0");
			precis = precis/10;
		}
		
		printf("%lld\n", curtdec);
		
		
	}
	
	return 0;
}


/*

p c
r l
r l
...
r l
r l

t = l*p/(pr-c)

7 5
2 1


*/