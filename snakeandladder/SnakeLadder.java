package snakeandladder;

public class SnakeLadder {
	int forOptions() {
		int options = (int)Math.floor(Math.random() * 3);
		System.out.println("If you get option 0 it is noPlay,1 it is ladder,2 it is snake ");
		System.out.println("You got option :" + options);
		return options;
	}
		int play() {
		int urPresentStep = 0;
		int noOfTimesdieRolled = 0;
		//int ladder = 1;
		//int snake = 2;
		while(urPresentStep < 100) {
			noOfTimesdieRolled++;
			SnakeLadder playing = new SnakeLadder();
			int dieRoll = (int)Math.floor(Math.random() * 6 + 1);
			System.out.println("The Number on dice: " + dieRoll);
			switch(playing.forOptions())
			{
			case 1:
				urPresentStep += dieRoll;
				if(urPresentStep > 100)
					urPresentStep -= dieRoll;
				System.out.println("You are on step:" + urPresentStep);
				int extraRoll = (int)Math.floor(Math.random() * 6 + 1);
				System.out.println("The Extra Roll for getting Ladder and you get Number :" + extraRoll);
				urPresentStep += extraRoll;
				if(urPresentStep > 100)
					urPresentStep -= extraRoll;
				System.out.println("You are on step:" + urPresentStep);
				break;
			case 2:
				urPresentStep -= dieRoll;
				if(urPresentStep < 0)
					urPresentStep = 0;
				System.out.println("You are on step:" + urPresentStep);
				break;
			default:
				System.out.println("You are on Step :" + urPresentStep);
			}
		}
			return noOfTimesdieRolled;
		}
		public static void main(String[] args) {
			SnakeLadder game = new SnakeLadder();
		    int playerOne = game.play();
		    int playerTwo = game.play();
		    System.out.println("No.of Times Dice rolled by playerOne to Reach 100: " + playerOne);
		    System.out.println("No.of Times Dice rolled by playerTwo to Reach 100: " + playerTwo);
		    if(playerOne < playerTwo)
		    	System.out.println("playerOne is winner");
		    else
		    	System.out.println("playerTwo is winner");
		}
}
