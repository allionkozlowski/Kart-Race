import java.util.ArrayList;

public class Shop
	{
		static ArrayList<Integer> topSpeeds = new ArrayList<Integer>();
		
		public static void fillSpeeeds()
		{
			topSpeeds.add(180);
			topSpeeds.add(160);
			topSpeeds.add(140);
			topSpeeds.add(120);
		}
		
		static ArrayList<Integer> accelerations = new ArrayList<Integer>();
		
		public static void fillAccelerations()
			{
				accelerations.add(2);
				accelerations.add(4);
				accelerations.add(6);
				accelerations.add(8);
			}
		
		static ArrayList<Integer> brakings = new ArrayList<Integer>();
		
		public static void fillBrakings()
			{
				brakings.add(2);
				brakings.add(4);
				brakings.add(6);
				brakings.add(8);
			}
		
		static ArrayList<Integer> turningSpeeds = new ArrayList<Integer>();
		
		public static void fillTurningSpeeds()
			{
				turningSpeeds.add(120);
				turningSpeeds.add(100);
				turningSpeeds.add(80);
				turningSpeeds.add(60);
			}
		
	}
