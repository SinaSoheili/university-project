#include <graphics.h>
#include <iostream.h>
#include <windows.h>
main()
{
    	initwindow(600 , 600);
    	setcolor(3);
    	line(100 , 300 , 500 , 300);
    	//BALA CHAP/////////////////
    	int x1=100 , y1=300 ;
    	while(x1<=300 && y1>=100)
    	{
    		line(x1 , 300 , 300 , y1);
    		x1=x1+10;
    		y1=y1-10;
    		Sleep(50);
    	}	 
    	//bala rast ///////////////
    	int x3=500 , y3=300 ;
    	while(x3>=300 && y3>=100)
    	{
    		line(x3 , 300 , 300 , y3);
    		x3=x3-10;
    		y3=y3-10;
    		Sleep(50);
    	}
    	//payyn chap///////////////
    	int x2=100 , y2=300 ;
    	while(x2<=300 && y2<=500)
    	{
    		line(x2 , 300 , 300 , y2);
    		x2=x2+10;
    		y2=y2+10;
    		Sleep(50);
    	}	 
    
    	//payyn rast ///////////////
    	int x4=500 , y4=300 ;
    	while(x4>=300 && y4>=100)
    	{
    		line(x4 , 300 , 300 , y4);
    		x4=x4-10;
    		y4=y4+10;
    		Sleep(50);
    	}
    	getch();
    	
}
