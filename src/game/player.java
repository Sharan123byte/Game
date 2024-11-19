package game;

abstract public class player {

	String name;
	char mark;
	abstract void makemove();
	boolean isvalidmove(int row, int col)
	{
		if(row>=0 && row<=2 && col>=0 && col<=2)
		{
			if(TicTacToe.board[row][col]==' ')
			{
				return true;
			}
		}
		System.out.println("Invalid move Enter again");
		return false;
		
	}
}
