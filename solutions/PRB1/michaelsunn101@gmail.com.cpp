#include<stdio.h>
#include<stdlib.h>
int main(void){
	char buf[1024];
	fgets(buf,1000,stdin);
	long n = atol(buf)+1;
	printf("%ld\n",n);
}
