package chapter7;
class Game{
	public Game(int i) {
		System.out.println("Game constructor "+i);
		// TODO Auto-generated constructor stub
	}
}
class BoardGame extends Game{
	public BoardGame() {
		super(11);
		System.out.println("BoardGame constructor");
		// TODO Auto-generated constructor stub
	}
}
public class Chess extends BoardGame {
	public static void main(String[] args) {
		new BoardGame();
	}
}
