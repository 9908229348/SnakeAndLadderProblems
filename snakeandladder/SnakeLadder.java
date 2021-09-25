package snakeandladder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		int dice = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("The number on dice is " + dice);
		int option = (int) Math.floor(Math.random() * 3);
		//int noPlay = 0;
		int ladder = 1;
		int snake = 2;
		int urPresentStep = 10;
		System.out.println("Present You are on Step:" + urPresentStep);
		System.out.println("If you get option as 0 it is noPlay,1 it is ladder,2 it is snake " );
		System.out.println("You got option" + option);
		if(option == ladder)
		{
			urPresentStep += dice;
			System.out.println("You are on :" + urPresentStep);
		}
			else if(option == snake)
			{
				urPresentStep -= dice;
				System.out.println("You are on : " + urPresentStep);
			}
			else 
			{
				System.out.println("You are on :" + urPresentStep);
			}
		
	}
}
