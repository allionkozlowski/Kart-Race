import java.util.ArrayList;
import java.util.Scanner;

public class Play
	{
		
		public static void main(String[] args)
			{
				//gameSetup();
				courseOption1();

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
				players.add(new Player(name2, 0, new Kart(0,0,0,0,"black"))); 
				
				
				
			}
		public static void courseOption1()
		{
			String [][] course1 = new String [15][30];
			for(int row=0; row<15; row++)
				{
					for(int col=0; col<30; col++)
						{
							course1[row][col] = " ";
						}
				}
			for(int i=0; i<8; i++)
				{
					course1[i][29] ="|";
				}
			for(int i=0; i<27; i++)
				{
					course1[2][i] = "_";
				}
			course1[3][26] = "|";
			course1[4][26] = "|";
			course1[5][26] = "|";
			System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
			System.out.println(course1[0][0]+" "+course1[0][1]+" "+course1[0][2]+" "+course1[0][3]+" "+course1[0][4]+" "+course1[0][5]+" "+course1[0][6]+" "+course1[0][7]+" "+course1[0][8]+" "+course1[0][9]+" "+course1[0][10]+" "+course1[0][11]+" "+course1[0][12]+" "+course1[0][13]+" "+course1[0][14]+" "+course1[0][15]+" "+course1[0][16]+" "+course1[0][17]+" "+course1[0][18]+" "+course1[0][19]+" "+course1[0][20]+" "+course1[0][21]+" "+course1[0][22]+" "+course1[0][23]+" "+course1[0][24]+" "+course1[0][25]+" "+course1[0][26]+" "+course1[0][27]+" "+course1[0][28]+" "+course1[0][29]);
			System.out.println(course1[1][0]+" "+course1[1][1]+" "+course1[1][2]+" "+course1[1][3]+" "+course1[1][4]+" "+course1[1][5]+" "+course1[1][6]+" "+course1[1][7]+" "+course1[1][8]+" "+course1[1][9]+" "+course1[1][10]+" "+course1[1][11]+" "+course1[1][12]+" "+course1[1][13]+" "+course1[1][14]+" "+course1[1][15]+" "+course1[1][16]+" "+course1[1][17]+" "+course1[1][18]+" "+course1[1][19]+" "+course1[1][20]+" "+course1[1][21]+" "+course1[1][22]+" "+course1[1][23]+" "+course1[1][24]+" "+course1[1][25]+" "+course1[1][26]+" "+course1[1][27]+" "+course1[1][28]+" "+course1[1][29]);
			System.out.println(course1[2][0]+" "+course1[2][1]+" "+course1[2][2]+" "+course1[2][3]+" "+course1[2][4]+" "+course1[2][5]+" "+course1[2][6]+" "+course1[2][7]+" "+course1[2][8]+" "+course1[2][9]+" "+course1[2][10]+" "+course1[2][11]+" "+course1[2][12]+" "+course1[2][13]+" "+course1[2][14]+" "+course1[2][15]+" "+course1[2][16]+" "+course1[2][17]+" "+course1[2][18]+" "+course1[2][19]+" "+course1[2][20]+" "+course1[2][21]+" "+course1[2][22]+" "+course1[2][23]+" "+course1[2][24]+" "+course1[2][25]+" "+course1[2][26]+" "+course1[2][27]+" "+course1[2][28]+" "+course1[2][29]);
			System.out.println("                                                     "+course1[3][26]+" "+course1[3][27]+" "+course1[3][28]+course1[3][29]);
			System.out.println("                                                     "+course1[4][26]+" "+course1[4][27]+" "+course1[4][28]+course1[4][29]);
			System.out.println("                                                     "+course1[5][26]+" "+course1[5][27]+" "+course1[5][28]+course1[5][29]);
			System.out.println("            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|"+course1[6][27]+" "+course1[6][28]+" "+course1[6][29]);
			
		}

	}
