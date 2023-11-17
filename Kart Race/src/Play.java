import java.util.ArrayList;
import java.util.Scanner;

public class Play
	{
		static ArrayList<Player> players = new ArrayList<Player>();
		static ArrayList<Kart> karts = new ArrayList<Kart>();
		static String [][] course1 = new String [15][29];
		static ArrayList<String> courseOption1 = new ArrayList<String>();
		
		static int kartNumberPlayer1 = 0;
		static int kartNumberPlayer2 = 0;
		
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
			System.out.println("You have 550 coins to spend to make your kart.");
			System.out.println("Here is the shop:");
			System.out.println("Acceleration: ");
			System.out.println("1) 2 sec [200 coins]");
			System.out.println("2) 4 sec [150 coins]");
			System.out.println("3) 6 sec [100 coins]");
			System.out.println(" ");
			System.out.println("Top Speed: ");
			System.out.println("1) 180 mph [200 coins]");
			System.out.println("2) 160 mph [150 coins]");
			System.out.println("3) 140 mph [100 coins]");
			System.out.println();
			System.out.println("Braking: ");
			System.out.println("1) 2 sec [200 coins]");
			System.out.println("2) 4 sec [150 coins]");
			System.out.println("3) 6 sec [100 coins]");
			System.out.println();
			System.out.println("Turning Speed: ");
			System.out.println("1) 180 mph [200 coins]");
			System.out.println("2) 160 mph [150 coins]");
			System.out.println("3) 140 mph [100 coins]");

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
			
			if(acceleration1 == 1)
				{
					if(topSpeed1 == 1)
						{
							kartNumberPlayer1 = 1;
						}
					else if(topSpeed1 == 2)
						{
							if(braking1 == 3)
								{
									kartNumberPlayer1 = 2;
								}
							else if(braking1 == 2)
								{
									kartNumberPlayer1 = 3;
								}
						}
					else if(topSpeed1 == 3)
						{
							if(braking1 == 3)
								{
									kartNumberPlayer1 = 4;
								}
							else if(braking1 == 2)
								{
									kartNumberPlayer1 = 6;
								}
							else if(braking1 == 1)
								{
									kartNumberPlayer1 = 5;
								}
						}
				}
			else if(acceleration1 == 2)
				{
					if(topSpeed1 == 1)
						{
							if(braking1 == 2)
								{
									kartNumberPlayer1 = 7;
								}
							else if(braking1 == 3)
								{
									kartNumberPlayer1 = 8;
								}
						}
					else if(topSpeed1 == 2)
						{
							if(braking1 == 1)
								{
									kartNumberPlayer1 = 9;
								}
							else if(braking1 == 3)
								{
									kartNumberPlayer1 = 10;
								}
						}
					else if(topSpeed1 == 3)
						{
							if(braking1 == 1)
								{
									kartNumberPlayer1 = 11;
								}
							else if(braking1 == 2)
								{
									kartNumberPlayer1 = 12;
								}
						}
				}
			else if(acceleration1 == 3)
				{
					if(topSpeed1 == 1)
						{
							if(braking1 == 1)
								{
									kartNumberPlayer1 = 13;
								}
							else if(braking1 == 2)
								{
									kartNumberPlayer1 = 14;
								}
							else if(braking1 == 3)
								
								{
									kartNumberPlayer1 = 15;
								}
						}
					else if(topSpeed1 == 2)
						{
							if(braking1 == 1)
								{
									kartNumberPlayer1 = 16;
								}
							else if(braking1 == 2)
								{
									kartNumberPlayer1 = 17;
								}
						}
					else if(topSpeed1 == 2)
						{
							kartNumberPlayer1 = 18;
						}
				}
			
		}
		
		public static void player2Kart()
		{
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("");
			System.out.println("You have 550 coins to spend to make your kart.");
			System.out.println("Here is the shop:");
			System.out.println("Acceleration: ");
			System.out.println("1) 2 sec [200 coins]");
			System.out.println("2) 4 sec [150 coins]");
			System.out.println("3) 6 sec [100 coins]");
			System.out.println(" ");
			System.out.println("Top Speed: ");
			System.out.println("1) 180 mph [200 coins]");
			System.out.println("2) 160 mph [150 coins]");
			System.out.println("3) 140 mph [100 coins]");
			System.out.println();
			System.out.println("Braking: ");
			System.out.println("1) 2 sec [200 coins]");
			System.out.println("2) 4 sec [150 coins]");
			System.out.println("3) 6 sec [100 coins]");
			System.out.println();
			System.out.println("Turning Speed: ");
			System.out.println("1) 180 mph [200 coins]");
			System.out.println("2) 160 mph [150 coins]");
			System.out.println("3) 140 mph [100 coins]");

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
			
			if(acceleration2 == 1)
				{
					if(topSpeed2 == 1)
						{
							kartNumberPlayer2 = 1;
						}
					else if(topSpeed2 == 2)
						{
							if(braking2 == 3)
								{
									kartNumberPlayer2 = 2;
								}
							else if(braking2 == 2)
								{
									kartNumberPlayer2 = 3;
								}
						}
					else if(topSpeed2 == 3)
						{
							if(braking2 == 3)
								{
									kartNumberPlayer2 = 4;
								}
							else if(braking2 == 2)
								{
									kartNumberPlayer2 = 6;
								}
							else if(braking2 == 1)
								{
									kartNumberPlayer2 = 5;
								}
						}
				}
			else if(acceleration2 == 2)
				{
					if(topSpeed2 == 1)
						{
							if(braking2 == 2)
								{
									kartNumberPlayer2 = 7;
								}
							else if(braking2 == 3)
								{
									kartNumberPlayer2 = 8;
								}
						}
					else if(topSpeed2 == 2)
						{
							if(braking2 == 1)
								{
									kartNumberPlayer2 = 9;
								}
							else if(braking2 == 3)
								{
									kartNumberPlayer2 = 10;
								}
						}
					else if(topSpeed2 == 3)
						{
							if(braking2 == 1)
								{
									kartNumberPlayer2 = 11;
								}
							else if(braking2 == 2)
								{
									kartNumberPlayer2 = 12;
								}
						}
				}
			else if(acceleration2 == 3)
				{
					if(topSpeed2 == 1)
						{
							if(braking2 == 1)
								{
									kartNumberPlayer2 = 13;
								}
							else if(braking2 == 2)
								{
									kartNumberPlayer2 = 14;
								}
							else if(braking2 == 3)
								
								{
									kartNumberPlayer2 = 15;
								}
						}
					else if(topSpeed2 == 2)
						{
							if(braking2 == 1)
								{
									kartNumberPlayer2 = 16;
								}
							else if(braking2 == 2)
								{
									kartNumberPlayer2 = 17;
								}
						}
					else if(topSpeed2 == 2)
						{
							kartNumberPlayer2 = 18;
						}
				}
			
		}
		
		public static void playCourse1()
		{
			Scanner userInput = new Scanner(System.in);
			
			for(int row=0; row<15; row++)
			{
				for(int col=0; col<29; col++)
					{
						course1[row][col] = " ";
					}
			}
			
			int turn = 0;
			boolean stillRacing =  true;
			while(stillRacing == true)
			{
				if(kartNumberPlayer1 == 1)
				{
					if(turn == 0)
						{
							course1[0][0] = "X";
							course1[1][0] = "X";
						}
					else if(turn == 1)
						{
							course1[0][4] = "X";
							course1[0][0] = " ";
						}
					else if(turn == 2)
						{
							course1[0][8] = "X";
							course1[0][4] = " ";																																																																		
						}
					else if(turn == 3)
						{
							course1[0][12] = "X";
							course1[0][8] = " ";																																																																		
						}
					else if(turn == 4)
						{
							course1[0][16] = "X";
							course1[0][12] = " ";																																																																		
						}
					else if(turn == 5)
						{
							course1[0][20] = "X";
							course1[0][16] = " ";																																																																		
						}
					else if(turn == 6)
						{
							course1[0][24] = "X";
							course1[0][20] = " ";																																																																		
						}
					else if(turn == 7)
						{
							course1[0][27] = "X";
							course1[0][24] = " ";																																																																		
						}
		
					else if(turn == 8)
						{
							course1[2][28] = "X";
							course1[0][27] = " ";																																																																		
						}
					else if(turn == 9)
						{
							course1[4][28] = "X";
							course1[2][28] = " ";																																																																		
						}
					else if(turn == 10)
						{
							course1[6][28] = "X";
							course1[4][28] = " ";																																																																		
						}
					else if(turn == 11)
						{
							course1[6][25] = "X";
							course1[6][28] = " ";																																																																		
						}
					else if(turn == 12)
						{
							course1[6][21] = "X";
							course1[6][25] = " ";																																																																		
						}
					else if(turn == 13)
						{
							course1[6][17] = "X";
							course1[6][21] = " ";																																																																		
						}
					else if(turn == 14)
						{
							course1[6][13] = "X";
							course1[6][17] = " ";																																																																		
						}
					else if(turn == 15)
						{
							course1[6][10] = "X";
							course1[6][13] = " ";																																																																		
						}
					else if(turn == 16)
						{
							course1[6][8] = "X";
							course1[6][10] = " ";																																																																		
						}
					else if(turn == 17)
						{
							course1[8][8] = "X";
							course1[6][8] = " ";																																																																		
						}
					else if(turn == 18)
						{
							course1[10][8] = "X";
							course1[8][8] = " ";																																																																		
						}
					else if(turn == 19)
						{
							course1[10][12] = "X";
							course1[10][8] = " ";																																																																		
						}
					else if(turn == 20)
						{
							course1[10][16] = "X";
							course1[10][12] = " ";																																																																		
						}
					else if(turn == 21)
						{
							course1[10][19] = "X";
							course1[10][16] = " ";																																																																		
						}
					
				}
				else if(kartNumberPlayer1 == 2)
				{
					if(turn == 0)
						{
							course1[0][0] = "X";
							course1[1][0] = "X";
						}
					else if(turn == 1)
						{
							course1[0][4] = "X";
							course1[0][0] = " ";
						}
					else if(turn == 2)
						{
							course1[0][7] = "X";
							course1[0][4] = " ";																																																																		
						}
					else if(turn == 3)
						{
							course1[0][10] = "X";
							course1[0][7] = " ";																																																																		
						}
					else if(turn == 4)
						{
							course1[0][13] = "X";
							course1[0][10] = " ";																																																																		
						}
					else if(turn == 5)
						{
							course1[0][16] = "X";
							course1[0][13] = " ";																																																																		
						}
					else if(turn == 6)
						{
							course1[0][19] = "X";
							course1[0][16] = " ";																																																																		
						}
					else if(turn == 7)
						{
							course1[0][22] = "X";
							course1[0][19] = " ";																																																																		
						}
		
					else if(turn == 8)
						{
							course1[0][25] = "X";
							course1[0][22] = " ";																																																																		
						}
					else if(turn == 9)
						{
							course1[0][28] = "X";
							course1[0][25] = " ";																																																																		
						}
					else if(turn == 10)
						{
							course1[2][28] = "X";
							course1[0][28] = " ";																																																																		
						}
					else if(turn == 11)
						{
							course1[4][28] = "X";
							course1[2][28] = " ";																																																																		
						}
					else if(turn == 12)
						{
							course1[6][27] = "X";
							course1[4][28] = " ";																																																																		
						}
					else if(turn == 13)
						{
							course1[6][25] = "X";
							course1[6][27] = " ";																																																																		
						}
					else if(turn == 14)
						{
							course1[6][22] = "X";
							course1[6][25] = " ";																																																																		
						}
					else if(turn == 15)
						{
							course1[6][19] = "X";
							course1[6][22] = " ";																																																																		
						}
					else if(turn == 16)
						{
							course1[6][16] = "X";
							course1[6][19] = " ";																																																																		
						}
					else if(turn == 17)
						{
							course1[6][13] = "X";
							course1[6][16] = " ";																																																																		
						}
					else if(turn == 18)
						{
							course1[6][10] = "X";
							course1[6][13] = " ";																																																																		
						}
					else if(turn == 19)
						{
							course1[7][8] = "X";
							course1[6][10] = " ";																																																																		
						}
					else if(turn == 20)
						{
							course1[10][8] = "X";
							course1[7][8] = " ";																																																																		
						}
					else if(turn == 21)
						{
							course1[10][11] = "X";
							course1[10][8] = " ";																																																																		
						}
					else if(turn == 22)
						{
							course1[10][14] = "X";
							course1[10][11] = " ";																																																																		
						}
					else if(turn == 23)
						{
							course1[10][17] = "X";
							course1[10][14] = " ";																																																																		
						}
					else if(turn == 24)
						{
							course1[10][19] = "X";
							course1[10][17] = " ";																																																																		
						}
					
				}
				
				if(kartNumberPlayer2 == 1)
				{
					if(turn == 0)
						{
							course1[0][0] = "X";
							course1[1][0] = "X";
						}
					else if(turn == 1)
						{
							course1[1][4] = "X";
							course1[1][0] = " ";
						}
					else if(turn == 2)
						{
							course1[1][8] = "X";
							course1[1][4] = " ";																																																																		
						}
					else if(turn == 3)
						{
							course1[1][12] = "X";
							course1[1][8] = " ";																																																																		
						}
					else if(turn == 4)
						{
							course1[1][16] = "X";
							course1[1][12] = " ";																																																																		
						}
					else if(turn == 5)
						{
							course1[1][20] = "X";
							course1[1][16] = " ";																																																																		
						}
					else if(turn == 6)
						{
							course1[1][24] = "X";
							course1[1][20] = " ";																																																																		
						}
					else if(turn == 7)
						{
							course1[1][26] = "X";
							course1[1][24] = " ";																																																																		
						}
		
					else if(turn == 8)
						{
							course1[2][27] = "X";
							course1[1][26] = " ";																																																																		
						}
					else if(turn == 9)
						{
							course1[4][27] = "X";
							course1[2][27] = " ";																																																																		
						}
					else if(turn == 10)
						{
							course1[5][26] = "X";
							course1[4][27] = " ";																																																																		
						}
					else if(turn == 11)
						{
							course1[5][22] = "X";
							course1[5][26] = " ";																																																																		
						}
					else if(turn == 12)
						{
							course1[5][18] = "X";
							course1[5][22] = " ";																																																																		
						}
					else if(turn == 13)
						{
							course1[5][14] = "X";
							course1[5][18] = " ";																																																																		
						}
					else if(turn == 14)
						{
							course1[5][11] = "X";
							course1[5][14] = " ";																																																																		
						}
					else if(turn == 15)
						{
							course1[5][8] = "X";
							course1[5][11] = " ";																																																																		
						}
					else if(turn == 16)
						{
							course1[7][7] = "X";
							course1[5][8] = " ";																																																																		
						}
					else if(turn == 17)
						{
							course1[9][7] = "X";
							course1[7][7] = " ";																																																																		
						}
					else if(turn == 18)
						{
							course1[11][8] = "X";
							course1[9][7] = " ";																																																																		
						}
					else if(turn == 19)
						{
							course1[11][12] = "X";
							course1[11][8] = " ";																																																																		
						}
					else if(turn == 20)
						{
							course1[11][16] = "X";
							course1[11][12] = " ";																																																																		
						}
					else if(turn == 21)
						{
							course1[11][19] = "X";
							course1[11][16] = " ";																																																																		
						}
					
				}
				String courseOne = "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n "+course1[0][0]+" "+course1[0][1]+" "+course1[0][2]+" "+course1[0][3]+" "+course1[0][4]+" "+course1[0][5]+" "+course1[0][6]+" "+course1[0][7]+" "+course1[0][8]+" "+course1[0][9]+" "+course1[0][10]+" "+course1[0][11]+" "+course1[0][12]+" "+course1[0][13]+" "+course1[0][14]+" "+course1[0][15]+" "+course1[0][16]+" "+course1[0][17]+" "+course1[0][18]+" "+course1[0][19]+" "+course1[0][20]+" "+course1[0][21]+" "+course1[0][22]+" "+course1[0][23]+" "+course1[0][24]+" "+course1[0][25]+" "+course1[0][26]+" "+course1[0][27]+" "+course1[0][28]+" |\n "+course1[1][0]+" "+course1[1][1]+" "+course1[1][2]+" "+course1[1][3]+" "+course1[1][4]+" "+course1[1][5]+" "+course1[1][6]+" "+course1[1][7]+" "+course1[1][8]+" "+course1[1][9]+" "+course1[1][10]+" "+course1[1][11]+" "+course1[1][12]+" "+course1[1][13]+" "+course1[1][14]+" "+course1[1][15]+" "+course1[1][16]+" "+course1[1][17]+" "+course1[1][18]+" "+course1[1][19]+" "+course1[1][20]+" "+course1[1][21]+" "+course1[1][22]+" "+course1[1][23]+" "+course1[1][24]+" "+course1[1][25]+" "+course1[1][26]+" "+course1[1][27]+" "+course1[1][28]+" |\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _      |\n                                                     | "+course1[2][27]+" "+course1[2][28]+ " |\n                                                     | "+course1[3][27]+" "+course1[3][28]+ " |\n              _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| "+course1[4][27]+" "+course1[4][28]+ " |\n             | "+course1[5][7]+" "+course1[5][8]+" "+course1[5][9]+" "+course1[5][10]+" "+course1[5][11]+" "+course1[5][12]+" "+course1[5][13]+" "+course1[5][14]+" "+course1[5][15]+" "+course1[5][16]+" "+course1[5][17]+" "+course1[5][18]+" "+course1[5][19]+" "+course1[5][20]+" "+course1[5][21]+" "+course1[5][22]+" "+course1[5][23]+" "+course1[5][24]+" "+course1[5][25]+" "+course1[5][26]+" "+course1[5][27]+" "+course1[5][28]+" |\n             | "+course1[6][7]+" "+course1[6][8]+" "+course1[6][9]+" "+course1[6][10]+" "+course1[6][11]+" "+course1[6][12]+" "+course1[6][13]+" "+course1[6][14]+" "+course1[6][15]+" "+course1[6][16]+" "+course1[6][17]+" "+course1[6][18]+" "+course1[6][19]+" "+course1[6][20]+" "+course1[6][21]+" "+course1[6][22]+" "+course1[6][23]+" "+course1[6][24]+" "+course1[6][25]+" "+course1[6][26]+" "+course1[6][27]+" "+course1[6][28]+" |\n             |      _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|\n             | "+course1[7][7]+" "+course1[7][8]+" |\n             | "+course1[8][7]+" "+course1[8][8]+" |\n             | "+course1[9][7]+" "+course1[9][8]+" |_ _ _ _ _ _ _ _ _ _ _\n             | "+course1[10][7]+" "+course1[10][8]+" "+course1[10][9]+" "+course1[10][10]+" "+course1[10][11]+" "+course1[10][12]+" "+course1[10][13]+" "+course1[10][14]+" "+course1[10][15]+" "+course1[10][16]+" "+course1[10][17]+" "+course1[10][18]+" "+course1[10][19]+" |\n             | "+course1[11][7]+" "+course1[11][8]+" "+course1[11][9]+" "+course1[11][10]+" "+course1[11][11]+" "+course1[11][12]+" "+course1[11][13]+" "+course1[11][14]+" "+course1[11][15]+" "+course1[11][16]+" "+course1[11][17]+" "+course1[11][18]+" "+course1[11][19]+" |\n             |_ _ _ _ _ _ _ _ _ _ _ _ _ _|";
				System.out.println(courseOne);
				System.out.println("  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n");					
				
				int play = userInput.nextInt();
				if(play == 1)
				{
					turn++;
				}
				
				if(turn == 26)
				{
					stillRacing = false;
				}
			}
			
				
		}
		
		public static void courseOnePrint()
		{
			System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
			System.out.println(" "+course1[0][0]+" "+course1[0][1]+" "+course1[0][2]+" "+course1[0][3]+" "+course1[0][4]+" "+course1[0][5]+" "+course1[0][6]+" "+course1[0][7]+" "+course1[0][8]+" "+course1[0][9]+" "+course1[0][10]+" "+course1[0][11]+" "+course1[0][12]+" "+course1[0][13]+" "+course1[0][14]+" "+course1[0][15]+" "+course1[0][16]+" "+course1[0][17]+" "+course1[0][18]+" "+course1[0][19]+" "+course1[0][20]+" "+course1[0][21]+" "+course1[0][22]+" "+course1[0][23]+" "+course1[0][24]+" "+course1[0][25]+" "+course1[0][26]+" "+course1[0][27]+" "+course1[0][28]+" |");
			System.out.println(" "+course1[1][0]+" "+course1[1][1]+" "+course1[1][2]+" "+course1[1][3]+" "+course1[1][4]+" "+course1[1][5]+" "+course1[1][6]+" "+course1[1][7]+" "+course1[1][8]+" "+course1[1][9]+" "+course1[1][10]+" "+course1[1][11]+" "+course1[1][12]+" "+course1[1][13]+" "+course1[1][14]+" "+course1[1][15]+" "+course1[1][16]+" "+course1[1][17]+" "+course1[1][18]+" "+course1[1][19]+" "+course1[1][20]+" "+course1[1][21]+" "+course1[1][22]+" "+course1[1][23]+" "+course1[1][24]+" "+course1[1][25]+" "+course1[1][26]+" "+course1[1][27]+" "+course1[1][28]+" |");
			System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _      |");
			System.out.println("                                                     | "+course1[2][27]+" "+course1[2][28]+ " |");
			System.out.println("                                                     | "+course1[3][27]+" "+course1[3][28]+ " |");
			System.out.println("              _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| "+course1[4][27]+" "+course1[4][28]+ " |");
			System.out.println("             | "+course1[5][7]+" "+course1[5][8]+" "+course1[5][9]+" "+course1[5][10]+" "+course1[5][11]+" "+course1[5][12]+" "+course1[5][13]+" "+course1[5][14]+" "+course1[5][15]+" "+course1[5][16]+" "+course1[5][17]+" "+course1[5][18]+" "+course1[5][19]+" "+course1[5][20]+" "+course1[5][21]+" "+course1[5][22]+" "+course1[5][23]+" "+course1[5][24]+" "+course1[5][25]+" "+course1[5][26]+" "+course1[5][27]+" "+course1[5][28]+" |");
			System.out.println("             | "+course1[6][7]+" "+course1[6][8]+" "+course1[6][9]+" "+course1[6][10]+" "+course1[6][11]+" "+course1[6][12]+" "+course1[6][13]+" "+course1[6][14]+" "+course1[6][15]+" "+course1[6][16]+" "+course1[6][17]+" "+course1[6][18]+" "+course1[6][19]+" "+course1[6][20]+" "+course1[6][21]+" "+course1[6][22]+" "+course1[6][23]+" "+course1[6][24]+" "+course1[6][25]+" "+course1[6][26]+" "+course1[6][27]+" "+course1[6][28]+" |");
			System.out.println("             |      _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
			System.out.println("             | "+course1[7][7]+" "+course1[7][8]+" |");
			System.out.println("             | "+course1[8][7]+" "+course1[8][8]+" |");
			System.out.println("             | "+course1[9][7]+" "+course1[9][8]+" |_ _ _ _ _ _ _ _ _ _ _");
			System.out.println("             | "+course1[10][7]+" "+course1[10][8]+" "+course1[10][9]+" "+course1[10][10]+" "+course1[10][11]+" "+course1[10][12]+" "+course1[10][13]+" "+course1[10][14]+" "+course1[10][15]+" "+course1[10][16]+" "+course1[10][17]+" "+course1[10][18]+" "+course1[10][19]+" "+course1[10][20]+" |");
			System.out.println("             | "+course1[11][7]+" "+course1[11][8]+" "+course1[11][9]+" "+course1[11][10]+" "+course1[11][11]+" "+course1[11][12]+" "+course1[11][13]+" "+course1[11][14]+" "+course1[11][15]+" "+course1[11][16]+" "+course1[11][17]+" "+course1[11][18]+" "+course1[11][19]+" "+course1[11][20]+" |");
			System.out.println("             |_ _ _ _ _ _ _ _ _ _ _ _ _ _|");
			
			
			
		}
		
		
		
	}
