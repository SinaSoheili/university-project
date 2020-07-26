#include <iostream>
#include <conio.h>
#include <math.h>
#include <windows.h>
#include <string.h>
#include <time.h>
#include <graphics.h>
using namespace std;
main()
{
	initwindow(600 , 800);
	line(100,700,500,700);
	int a=100 , b=500, c=700 ;
	//   SAMT RAST   //
	while(a<=500  &&  b>=300 )
	{
		setcolor(4);
		line(a,700,b,c);
		a+=20;
		b-=10;
		c=3*b-800;
		Sleep(100);		
	}
	//   SAMT CHAP   //
	
	int d=500 , e=100 ,f=700;
	while(d>=100 && e<=300 )
	{
		setcolor(3);
		line(d,700,e,f);
		d-=20;
		e+=10;
		f=-3*e+1000;
		Sleep(100);	
	}
	
	getch();
}
