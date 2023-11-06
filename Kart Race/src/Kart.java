
public class Kart
	{
		private int acceleration;
		private int topSpeed;
		private int braking;
		private int turning;
		private String color;
		
		public Kart(int a, int s, int b, int t, String c)
		{
			acceleration = a;
			topSpeed = s;
			braking = b;
			turning = t;
			color = c;
		}
		
		public int getAcceleration()
		{
			return acceleration;
		}
		
		public void setAcceleration()
		{
			this.acceleration = acceleration;
		}
		
		public int getTopSpeed()
		{
			return topSpeed;
		}
		
		public void setTopSpeed()
		{
			this.topSpeed = topSpeed;
		}
		
		public int getBraking()
		{
			return braking;
		}
		
		public void setBraking()
		{
			this.braking = braking;
		}
		
		public int getTurning()
		{
			return turning;
		}
		
		public void setTurning()
		{
			this.turning = turning;
		}
		
		public String getColor()
		{
			return color;
		}
			
		public void setColor()
		{
			this.color = color;
		}
		

	}
