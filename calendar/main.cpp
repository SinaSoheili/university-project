#include <iostream>
#include <conio.h>
#include <math.h>
#include <windows.h>
#include <string.h>
#include <time.h>
#include <fstream>
using namespace std;

string month_name[] = {"FARVARDIN" , "ORDIBEHESHT" , "KHORDAD" , "TIR" , "MORDAD" , "SHAHRIVAR" , "MEHR" , "ABAN" , "AZAR" , "DEY" , "BAHMAN" , "ESFAND"};
string seasonS[] = {"SPRING" , "SUMMER" , "AUTUMN" , "WINTER"};

//FUNCTION -------------------------------------------------
void print_haftegi(int StartDay)
{
	for(int month=0 ; month<12 ; month++)
	{
		cout<<month_name[month]<<":----------------------------------\n\n";
		
		cout<<"Sa\t"<<"Su\t"<<"mo\t"<<"Tu\t"<<"We\t"<<"Th\t"<<"Fr\n";
		
		for(int j=0 ; j<StartDay ; j++)
		{
			cout<<"\t";
		}
				
		int max_day_of_month;
		if(month<=5) /// mah haye 31 rooze
		{	
			max_day_of_month = 31;
		}	
		else if(month>=6 && month<=10) /// mah haye 30 rooze
		{
			max_day_of_month = 30;
		}
		else if(month == 11) //mah 29 rooze
		{
			max_day_of_month = 29;
		}
					
		for(int day=0 ; day<=(max_day_of_month-1) ; day++)
		{	
			cout<<day+1<<"\t";
		
			if(((StartDay+1)+day)%7 == 0)
			{
				cout<<"\n\n";
				cout<<"Sa\t"<<"Su\t"<<"mo\t"<<"Tu\t"<<"We\t"<<"Th\t"<<"Fr\n";
			}
		}	
		
		StartDay += 2;
		if(month<=5) /// mah haye 31 rooze
		{	
			StartDay+=1;
		}	
		else if(month>=6 && month<=10) /// mah haye 30 rooze
		{
			StartDay+=0;
		}
		else if(month == 11) //mah 29 rooze
		{
			StartDay-=1;
		}
		StartDay %= 7;
		
		cout<<"\n\n\n\n";
	}
}

//----------------------------------------------------------
void print_mah_be_mah(int StartDay)
{
	
	for(int month=0 ; month<12 ; month++)
	{
		cout<<month_name[month]<<":----------------------------------\n\n";
		
		cout<<"Sa\t"<<"Su\t"<<"mo\t"<<"Tu\t"<<"We\t"<<"Th\t"<<"Fr\n";
		
		for(int j=0 ; j<StartDay ; j++)
		{
			cout<<"\t";
		}
				
		int max_day_of_month;
		if(month<=5) /// mah haye 31 rooze
		{	
			max_day_of_month = 31;
		}	
		else if(month>=6 && month<=10) /// mah haye 30 rooze
		{
			max_day_of_month = 30;
		}
		else if(month == 11) //mah 29 rooze
		{
			max_day_of_month = 29;
		}
					
		for(int day=0 ; day<=(max_day_of_month-1) ; day++)
		{	
			cout<<day+1<<"\t";
		
			if(((StartDay+1)+day)%7 == 0)
			{
				cout<<"\n";
			}
		}	
		
		StartDay += 2;
		if(month<=5) /// mah haye 31 rooze
		{	
			StartDay+=1;
		}	
		else if(month>=6 && month<=10) /// mah haye 30 rooze
		{
			StartDay+=0;
		}
		else if(month == 11) //mah 29 rooze
		{
			StartDay-=1;
		}
		StartDay %= 7;
		
		cout<<"\n\n\n\n";
	}
}
//----------------------------------------------------------
void print_fasl_be_fasl(int StartDay)
{
	for(int month=0 ; month<12 ; month++)
	{
		if(month%3 == 0)
		{
			cout<<seasonS[month/3]<<" : <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n\n";
		}
		
		cout<<month_name[month]<<":---------------\n\n";
		
		cout<<"Sa\t"<<"Su\t"<<"mo\t"<<"Tu\t"<<"We\t"<<"Th\t"<<"Fr\n";
		
		for(int j=0 ; j<StartDay ; j++)
		{
			cout<<"\t";
		}
				
		int max_day_of_month;
		if(month<=5) /// mah haye 31 rooze
		{	
			max_day_of_month = 31;
		}	
		else if(month>=6 && month<=10) /// mah haye 30 rooze
		{
			max_day_of_month = 30;
		}
		else if(month == 11) //mah 29 rooze
		{
			max_day_of_month = 29;
		}
					
		for(int day=0 ; day<=(max_day_of_month-1) ; day++)
		{	
			cout<<day+1<<"\t";
		
			if(((StartDay+1)+day)%7 == 0)
			{
				cout<<"\n";
			}
		}	
		
		StartDay += 2;
		if(month<=5) /// mah haye 31 rooze
		{	
			StartDay+=1;
		}	
		else if(month>=6 && month<=10) /// mah haye 30 rooze
		{
			StartDay+=0;
		}
		else if(month == 11) //mah 29 rooze
		{
			StartDay-=1;
		}
		StartDay %= 7;
		
		cout<<"\n\n\n\n";	
	}
}
//----------------------------------------------------------
main()
{	
	int start_day = -1; 	
	
	cout<<"Saturday----> 0\n"
		<<"Sunday------> 1\n"
		<<"Monday------> 2\n"
		<<"Tuesday-----> 3\n"
		<<"Wednesday---> 4\n"
		<<"Thursday----> 5\n"
		<<"Friday------> 6\n\n";
		
	cout<<"Insert number of start day : ";
	
	cin>>start_day;
	
	if(! ((start_day>=0) && (start_day<=6)))
	{
		cout<<"number is not valid";
		return 0;
	}
	else
	{
		system("cls");
		
		const int haftegi      = 0; 
		const int mah_be_mah   = 1;
		const int fasl_be_fasl = 2;
		
		int how_show = -1;
		
		cout<<"haftegi----------> 0\n"
			<<"mah be mah-------> 1\n"
			<<"fasl be fasl-----> 2\n\n";
		cout<<"How show calender : ";
		cin>>how_show;
		
		switch(how_show)
		{
			case haftegi:
				system("cls");
				print_haftegi(start_day);
				break;
				
			case mah_be_mah:
				system("cls");
				print_mah_be_mah(start_day);
				break;
				
			case fasl_be_fasl:
				system("cls");
				print_fasl_be_fasl(start_day);
				break;
				
			default:
				cout<<"type of calender not valid.";
				return 0;	
		}
		
	}	
	
	getch();
}	
