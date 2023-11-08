import java.util.ArrayList;
import java.util.Scanner;

public class Play
	{
		
		public static void main(String[] args)
			{
				gameSetup();

			}
		public static void gameSetup()
			{
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("Welcome to Kart Racing!");
				System.out.println("Player1: What is your name?");
				String name1 = userInput.nextLine();
				System.out.println("Player2: What is your name?");
				String name2 = userInput.nextLine();
				
				ArrayList<Player> players = new ArrayList<Player>();
				players.add(new Player(name1, 0, new Kart(0,0,0,0,"black")));
				players.add(new Player(name2, 0, new Kart(0,0,0,0,"black"))); //color and courses
				
				
				
			}
		public static void course1()
		{
			//comment 
			//comment #2
		}

	}
