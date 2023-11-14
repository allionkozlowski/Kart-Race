import java.util.ArrayList;
import java.util.Scanner;

public class Play
	{
		static ArrayList<Player> players = new ArrayList<Player>();
		static ArrayList<Kart> karts = new ArrayList<Kart>();
		static String [][] course1 = new String [15][29];
		static ArrayList<String> courseOption1 = new ArrayList<String>();
		
		public static void main(String[] args)
			{
				gameSetup();
				player1Kart();
				player2Kart();
				playCourse1();

			}
		public static void gameSetup()
			{
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("Welcome to Kart Racing!");
				System.out.println("Player1: What is your name?");
				String name1 = userInput.nextLine();
				System.out.println("Player2: What is your name?");
				String name2 = userInput.nextLine();
				
				players.add(new Player(name1, 0, new Kart(0,0,0,0,"black")));
				players.add(new Player(name2, 0, new Kart(0,0,0,0,"black"))); 	
				
			}
		
		public static void player1Kart()
		{
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("");
			System.out.println("Each of you have 550 coins to spend to make your kart.");
			System.out.println("Here is the shop:");
			System.out.println("Acceleration: ");
			System.out.println("1) 2 sec [200 coins]");
			System.out.println("2) 4 sec [150 coins]");
			System.out.println("3) 6 sec [100 coins]");
			System.out.println("2) 8 sec [50 coins]");
			System.out.println(" ");
			System.out.println("Top Speed: ");
			System.out.println("1) 180 mph [200 coins]");
			System.out.println("2) 160 mph [150 coins]");
			System.out.println("3) 140 mph [100 coins]");
			System.out.println("2) 120 mph [50 coins]");
			System.out.println();
			System.out.println("Braking: ");
			System.out.println("1) 2 sec [200 coins]");
			System.out.println("2) 4 sec [150 coins]");
			System.out.println("3) 6 sec [100 coins]");
			System.out.println("2) 8 sec [50 coins]");
			System.out.println();
			System.out.println("Turning Speed: ");
			System.out.println("1) 180 mph [200 coins]");
			System.out.println("2) 160 mph [150 coins]");
			System.out.println("3) 140 mph [100 coins]");
			System.out.println("2) 120 mph [50 coins]");

			System.out.println("Player1: For each feature type the number you want.");
			System.out.println("Acceleration:");
			int acceleration1 = userInput.nextInt();
			System.out.println("Top Speed:");
			int topSpeed1 = userInput.nextInt();
			System.out.println("Braking:");
			int braking1 = userInput.nextInt();
			System.out.println("Turning Speed:");
			int turningSpeed1 = userInput.nextInt();
			
			karts.add(new Kart(acceleration1, topSpeed1, braking1, turningSpeed1, "blue"));
			
			players.get(0).setKart(karts.get(0));
			
		}
		
		public static void player2Kart()
		{
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("");
			System.out.println("Each of you have 550 coins to spend to make your kart.");
			System.out.println("Here is the shop:");
			System.out.println("Acceleration: ");
			System.out.println("1) 2 sec [200 coins]");
			System.out.println("2) 4 sec [150 coins]");
			System.out.println("3) 6 sec [100 coins]");
			System.out.println("2) 8 sec [50 coins]");
			System.out.println(" ");
			System.out.println("Top Speed: ");
			System.out.println("1) 180 mph [200 coins]");
			System.out.println("2) 160 mph [150 coins]");
			System.out.println("3) 140 mph [100 coins]");
			System.out.println("2) 120 mph [50 coins]");
			System.out.println();
			System.out.println("Braking: ");
			System.out.println("1) 2 sec [200 coins]");
			System.out.println("2) 4 sec [150 coins]");
			System.out.println("3) 6 sec [100 coins]");
			System.out.println("2) 8 sec [50 coins]");
			System.out.println();
			System.out.println("Turning Speed: ");
			System.out.println("1) 180 mph [200 coins]");
			System.out.println("2) 160 mph [150 coins]");
			System.out.println("3) 140 mph [100 coins]");
			System.out.println("2) 120 mph [50 coins]");

			System.out.println("Player2: For each feature type the number you want.");
			System.out.println("Acceleration:");
			int acceleration2 = userInput.nextInt();
			System.out.println("Top Speed:");
			int topSpeed2 = userInput.nextInt();
			System.out.println("Braking:");
			int braking2 = userInput.nextInt();
			System.out.println("Turning Speed:");
			int turningSpeed2 = userInput.nextInt();
			
			karts.add(new Kart(acceleration2, topSpeed2, braking2, turningSpeed2, "purple"));
			
			players.get(1).setKart(karts.get(1));
			
		}
		
		public static void playCourse1()
		{
			for(int row=0; row<15; row++)
			{
				for(int col=0; col<29; col++)
					{
						course1[row][col] = " ";
					}
			}
			course1[0][0] = "X";
			course1[1][0] = "X";
			
			System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
			System.out.println(" "+course1[0][0]+" "+course1[0][1]+" "+course1[0][2]+" "+course1[0][3]+" "+course1[0][4]+" "+course1[0][5]+" "+course1[0][6]+" "+course1[0][7]+" "+course1[0][8]+" "+course1[0][9]+" "+course1[0][10]+" "+course1[0][11]+" "+course1[0][12]+" "+course1[0][13]+" "+course1[0][14]+" "+course1[0][15]+" "+course1[0][16]+" "+course1[0][17]+" "+course1[0][18]+" "+course1[0][19]+" "+course1[0][20]+" "+course1[0][21]+" "+course1[0][22]+" "+course1[0][23]+" "+course1[0][24]+" "+course1[0][25]+" "+course1[0][26]+" "+course1[0][27]+" "+course1[0][28]+" |");
			System.out.println(" "+course1[1][0]+" "+course1[1][1]+" "+course1[1][2]+" "+course1[1][3]+" "+course1[1][4]+" "+course1[1][5]+" "+course1[1][6]+" "+course1[1][7]+" "+course1[1][8]+" "+course1[1][9]+" "+course1[1][10]+" "+course1[1][11]+" "+course1[1][12]+" "+course1[1][13]+" "+course1[1][14]+" "+course1[1][15]+" "+course1[1][16]+" "+course1[1][17]+" "+course1[1][18]+" "+course1[1][19]+" "+course1[1][20]+" "+course1[1][21]+" "+course1[1][22]+" "+course1[1][23]+" "+course1[1][24]+" "+course1[1][25]+" "+course1[1][26]+" "+course1[1][27]+" "+course1[1][28]+" |");
			System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _      |");
			System.out.println("                                                     | "+course1[2][27]+" "+course1[2][28]+ " |");
			System.out.println("                                                     | "+course1[3][27]+" "+course1[3][28]+ " |");
			System.out.println("              _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| "+course1[4][27]+" "+course1[4][28]+ " |");
			System.out.println("             | "+course1[5][8]+" "+course1[5][9]+" "+course1[5][10]+" "+course1[5][11]+" "+course1[5][12]+" "+course1[5][13]+" "+course1[5][14]+" "+course1[5][15]+" "+course1[5][16]+" "+course1[5][17]+" "+course1[5][18]+" "+course1[5][19]+" "+course1[5][20]+" "+course1[5][21]+" "+course1[5][22]+" "+course1[5][23]+" "+course1[5][24]+" "+course1[5][25]+" "+course1[5][26]+" "+course1[5][27]+" "+course1[5][28]+" "+course1[5][28]+" |");
			System.out.println("             | "+course1[6][8]+" "+course1[6][9]+" "+course1[6][10]+" "+course1[6][11]+" "+course1[6][12]+" "+course1[6][13]+" "+course1[6][14]+" "+course1[6][15]+" "+course1[6][16]+" "+course1[6][17]+" "+course1[6][18]+" "+course1[6][19]+" "+course1[6][20]+" "+course1[6][21]+" "+course1[6][22]+" "+course1[6][23]+" "+course1[6][24]+" "+course1[6][25]+" "+course1[6][26]+" "+course1[6][27]+" "+course1[6][28]+" "+course1[6][28]+" |");
			System.out.println("             |      _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
			System.out.println("             | "+course1[7][8]+" "+course1[7][9]+" |");
			System.out.println("             | "+course1[8][8]+" "+course1[8][9]+" |");
			System.out.println("             | "+course1[9][8]+" "+course1[9][9]+" |_ _ _ _ _ _ _ _ _ _ _");
			System.out.println("             | "+course1[10][8]+" "+course1[10][9]+" "+course1[10][10]+" "+course1[10][11]+" "+course1[10][12]+" "+course1[10][13]+" "+course1[10][14]+" "+course1[10][15]+" "+course1[10][16]+" "+course1[10][17]+" "+course1[10][18]+" "+course1[10][19]+" "+course1[10][20]+" |");
			System.out.println("             | "+course1[11][8]+" "+course1[11][9]+" "+course1[11][10]+" "+course1[11][11]+" "+course1[11][12]+" "+course1[11][13]+" "+course1[11][14]+" "+course1[11][15]+" "+course1[11][16]+" "+course1[11][17]+" "+course1[11][18]+" "+course1[11][19]+" "+course1[11][20]+" |");
			System.out.println("             |_ _ _ _ _ _ _ _ _ _ _ _ _ _|");
			
			
			
			
			
		}
		
	}
