package game;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	static char [][]board;
	public TicTacToe()
	{
		board = new char[3][3];
		init();
	}
	void init()
	{
		for ( int i=0; i<board.length; i++)
		{
			for( int j=0; j<board[i].length; j++)
			{
				board[i][j]= ' ';
			}
		}
		display();
	}
	
	 static void display() 
	{
	for(int i =0; i<board.length; i++) {
		System.out.println("-------------");
	
	for(int j=0; j< board[i].length; j++)
	   {
		   System.out.print("| "+board[i][j]+" ");
	   }
	   System.out.println("|  ");
	}
	System.out.println("-------------");
	}
	
	static void placemark(int row, int col, char mark)
	{
		if(row>=0 && row<=2 && col>=0 && col<=2)
		{
			board[row][col]=mark;
		}
		else
		{
			System.out.println("Invalid Positin");
		}
	}
	
	static boolean checkcolwin() 
	{
		for(int j=0; j<3; j++)
		{
			if(board[0][j]!=' ' && board[0][j]== board[1][j] && board[1][j]== board[2][j])
			{
				return true;
			}
		}
		return false;
	}
	
	static boolean checkrowwin()
	{
		for (int i=0; i<3; i++)
		{
			if(board[i][0]!=' ' && board[i][0]== board[i][1] && board[i][1]== board[i][2])
			{
				return true;
			}
		}
		return false;
	}
	
	static boolean checkdiagwin()
	{
		if(board[0][0]!=' ' && board[0][0]== board[1][1] && board[1][1]==board[2][2]
				|| board[0][2]!=' ' && board[0][2]== board[1][1] && board[1][1]== board[2][0])
		{
			return true;
		}
		return false;
	}
	
	static boolean checkdraw()
	{
		for(int i =0 ; i<3 ; i++)
		{
			for( int j =0; j<3 ; j++)
			{
				if(board[i][j]==' ')
				{
					return false;
				}
			}
		}
		return true;
	}
}

 class HumanPlayer extends player
{
	
	HumanPlayer(String name, char mark)
	{
		this.name=name;
		this.mark=mark;
		
	}
	
	 void makemove()
	{
		Scanner s = new Scanner(System.in);
		int row; int col;
		do {
			System.out.println("Enter row and col ");
			row=s.nextInt();
			col=s.nextInt();
		}while(!isvalidmove(row,col));
		TicTacToe.placemark(row, col, mark);
	}
	
//	boolean isvalidmove(int row,int col)
//	{
//		if(row>=0 && row<=2 && col>=0 && col<=2)
//		{
//			if(TicTacToe.board[row][col]==' ')
//			{
//				return true;
//			}
//		}
//		System.out.println("Invalid move Enter again");
//		return false;
//	}
}
 
 class AIplayer extends player
 {
	 AIplayer(String name, char mark)
	 {
		 this.name=name;
		 this.mark=mark;
	 }

	@Override
	void makemove() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int row; int col;
		do 
		{
			Random r = new Random();
			row= r.nextInt(3);
			col = r.nextInt(3);
			
		}while(!isvalidmove(row,col));
		TicTacToe.placemark(row, col, mark);
		
	}
 }
 




