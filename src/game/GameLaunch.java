package game;
import game.TicTacToe;
import game.player;

public class GameLaunch {
	
	// Here you must specify the rows and column count to place the mark at some particular place.
	
	//     |0,0|0,1|0,2|
	//     |1,0|1,1|1,2|
	//     |2,0|2,1|2,2|

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TicTacToe T = new TicTacToe();
		HumanPlayer p1 = new HumanPlayer("Mahadev",'X');
		HumanPlayer p2 = new HumanPlayer("Sharan",'O');
		
//		AIplayer p2 = new AIplayer("AI",'O');
		
		HumanPlayer cp ;
		cp=p1;
		
		
		while(true) {
			System.out.println(cp.name+"'s turn");
			cp.makemove();
			TicTacToe.display();
			if(TicTacToe.checkcolwin()|| TicTacToe.checkrowwin()|| TicTacToe.checkdiagwin())
			{
				System.out.println(cp.name+" Won");
				break;
			}
			else if(TicTacToe.checkdraw())
			{
				System.out.println("Ohhh it's a Draw");
				break;
			}
			else
			{
				if(cp==p1)
				{
					cp=p2;
				}else
				{
					cp=p1;
				}
			}

		}

	}


	}


