#include<iostream.h>
#include<conio.h>
#include<fstream.h>
#include<process.h>
#include<string.h>
#include<stdio.h>
class student
{
int rno;
char name[40],add[40];
public:
void enter();
void display();
};
void student::enter()
{
cout<<"enter your rno name and address";
cin>>rno>>name>>add;
}
void student::display()
{
cout<<"rno is "<<rno<<endl<<"name is "<<name<<endl<<"address is "<<add<<endl;
}
void main()
{
char ch;
fstream file;
file.open("data.dat",ios::app||ios::in);
student s;
do
{
cout<<"you have the following options"<<endl;
cout<<"1.Add"<<endl<<"2.Display"<<endl<<"3.exit";
cin>>ch;
switch(ch)
{
case 1:
	file.open("data.dat",ios::app);
	s.enter();
	file.write((char*)&s,sizeof(s));
	file.close();
	break;
case 2:
	file.open("data.dat",ios::in);
	while(!file.eof())
	{
	 file.read((char*)&s,sizeof(s));
	 if(file.eof())
	 break;
	 s.display();
	}
	file.close();
	 break;
case 3:
	cout<<"thanks for using programme";
	exit(0);
	getch();
}
}while(ch!=4);
getch();
}