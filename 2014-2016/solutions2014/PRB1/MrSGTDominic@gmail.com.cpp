/*
This program was written by David Dominique, Grade 9, HHS.
It prompts the user for a number and generates/displays the square root of that number
*/



#include <stdio.h>
#include <math.h>
#include "conio.h"
#include <iostream>
using namespace std;

int main()
{
	float a;
	float c;


	cout << "Enter Value of A:";
	cin >> a;
	cout << "Entered Value of A:" << a << "\n";
	c = sqrt(a)*2;
	cout << "The Square Root of A multiplied by 2 is :" << c << "\n";
	_getch();

	return 0;

}