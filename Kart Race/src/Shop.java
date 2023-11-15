import java.util.ArrayList;

public class Shop
	{
		static ArrayList<Kart> kartOptions = new ArrayList<Kart>();
		
		public static void fillKartOptions()
		{
			kartOptions.add(new Kart(1,1,3,3,"black"));
			kartOptions.add(new Kart(1,3,3,1,"black"));
			kartOptions.add(new Kart(1,3,1,3,"black"));
			kartOptions.add(new Kart(1,2,2,3,"black"));
			kartOptions.add(new Kart(1,2,3,2,"black"));
			kartOptions.add(new Kart(1,3,2,2,"black"));
		}
		
	}
