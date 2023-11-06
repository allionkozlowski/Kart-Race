
public class Player
	{
		private String name;
		private int coins;
		private Kart kart;
		
		public Player (String n, int c, Kart k)
		{
			name = n;
			coins = c;
			kart = k;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setName()
		{
			this.name = name;
		}
		
		public int getCoins()
		{
			return coins;
		}
		
		public void setCoins()
		{
			this.coins = coins;
		}
		
		public Kart getKart()
		{
			return kart;
		}
		
		public void setKart()
		{
			this.kart = kart;
		}

	}
