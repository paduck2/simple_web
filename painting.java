package algoritm;

import java.sql.Time;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Timer;

public class painting {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(System.currentTimeMillis());
		
		byte recCnt = (byte) sc.nextInt();
		
		LinkedList<rectangle>list = new LinkedList<rectangle>();
		
		for(int i=0;i<recCnt;i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int size = sc.nextInt();
			
			rectangle r = new rectangle(x,y,size);
			
			
		}
		
		System.out.println(System.currentTimeMillis());
	}
	
}

class rectangle
{
	int xPostion = 0;
	int yPostion = 0;
	int size = 0;
	boolean [][] painted;
	
	public rectangle(int x, int y, int size)
	{
		this.xPostion = x;
		this.yPostion = y;
		this.size = size;
		this.painted = new boolean[size][size];
		System.out.println(painted[0][0]);
	}
	
}




////
//[입출력 예]
//입력 
//
//3
//4
//1 1 2 2 2 4 3 4 1 7 2 1
//4
//7 2 1 3 4 1 2 2 4 1 1 2
//3
//4 3 7 1 2 6 6 4 3
//
//출력
//#1 2 3 1 4 1
//1 2 15
//#2 1 1 1
//1 3 15
//#3 1 3 9
//1 2 33
