#include<iostream>
#include<set>
#include<algorithm>

using namespace std;


int factorial(int); 
void addElements(set<int>&);
void printFractions(set<int>&);
void checkNum(int);
int total;
int input;

int main() {
	cin >> input;
	total = factorial(input);
	set<int> nums;
	addElements(nums);
	set<int>::const_iterator iLocator;
	//cout << "Printing all possibilities: " << endl << "{ ";
	//for(iLocator = nums.begin(); iLocator != nums.end(); iLocator++) {
		//cout << *iLocator << " ";
	//}
	//cout << "}" << endl;
	for(iLocator = nums.begin(); iLocator != nums.end(); iLocator++) checkNum(*iLocator);
}

int factorial(int n) {
	if(n == 1 || n == 0) return n;
	return (n * factorial(n - 1));
}

void addElements(set<int> & nums) {
	for(int den = 1; den <= input; den++) {
		for(int num = 0; num <= den; num++) {
			nums.insert(total * num / den);
		}
	}
}

//void printFractions(set<int> & nums) {
	//set<int>::const_iterator iLocator;
	//for(iLocator = nums.begin(); iLocator != nums.end(); iLocator++) checkNum(*iLocator);
//}

void checkNum(int n) {
	for(int den = 1; den <= input; den++) {
		for(int num = 0; num <= den; num++) {
			if(((double)num / (double)den * total) == n) {
				cout << num << "/" << den << endl;
				return;;
			}
		}
	}
}
 
