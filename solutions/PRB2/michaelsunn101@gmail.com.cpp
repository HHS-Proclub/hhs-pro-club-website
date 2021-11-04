#include<stdio.h>
#include<stdlib.h>
#include<string.h>
/*
void test_haiku(void){
	register int row;
	int res = 1;
	for(row = 0; row < 3; row++){
		char*tok=NULL;
		char buf[8192];
		register int numsyll = 0;
		fgets(buf,8192,stdin);
		tok=strtok(buf," ");
		while(tok){
			numsyll++;
			tok=strtok(NULL," ");
		};
		printf("%d\n",numsyll);
		if(row%2){
			if(numsyll!=7)
				res=0;
		}else{
			if(numsyll!=5)
				res=0;
		}
	}
	if(res)
		puts("YES");
	else
		puts("NO");
}
*/

int is_vowel(char c){
	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		return 1;
	return 0;
}

void test_haiku(void){
	int res=1;
	for(int r = 0; r < 3; r++){
		char buf[8192];
		int ns=0;
		fgets(buf,8192,stdin);
		int i = 0;
		while(buf[i]!='\n'){
			 if(is_vowel(buf[i])){
				 ns++;
			 }
			 i++;
		}
		if(r%2){
			if(ns!=7)
				res=0;
		}else{
			if(ns!=5)
				res=0;
		}
	}
	if(res)
		puts("YES");
	else
		puts("NO");
}

int main(void){
	long num_cases;
	scanf("%ld\n",&num_cases);
	int i;
	for(i=0; i < num_cases; i++){
		test_haiku();
	}
	return 0;
}
