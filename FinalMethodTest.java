
public class FinalMethodTest {
	public static void main(String[] args) {
		Chess chess = new GraphicalChess();
		Game game = new Game();
		game.upload(chess);
	}
}
class Game
{
	void upload(Chess c) {
		System.out.println("Uploading the game....");
		//c.moveKnight();
		c.moveBishop();
	}
}
/*
 *1 ROOK KNIGHT  BISHOP	KING QUEEN BISHOP KNIGHT ROOK
 *2 pawn	pawn	pawn	pawn pawn  pawn   pawn   pawn
 *3
 *4
 *5
 *6 
 *7 pawn	pawn	pawn	pawn pawn  pawn   pawn   pawn
 *8 ROOK KNIGHT  BISHOP	KING QUEEN BISHOP KNIGHT ROOK
 * 
 * 
 * 
 * 
 * 
 */
final class Chess // MODI "ACQUIRED" is the developer of this class
{
	void moveKnight() { //math logic is developed here
		System.out.println("moving the knite in L shape ie 2.5 steps");
	}
	void moveBishop() {
		System.out.println("moving the Bishop in diagonal way in bidirection ");
	}
}
class GraphicalChess extends Chess //RAHUL - "BORN" 
{
	void moveBishop() { //math logic is developed here
		System.out.println("moving the Bishop in any bidirection as if it is a QUEEN");
	}
	
}

