import java.util.ArrayList;
import java.util.Scanner;
public class Pokemon
	{
		 String playerName;
		 String name;
		 String type;
		 double attack;
		 double defense;
		 double speed;
		 double health;
		public Pokemon (String n,String t, double a, double d, double s, double h)
			{
				name=n;
				type=t;
				attack=a;
				defense=d;
				speed=s;
				health=h;
			}
		
		public String getPlayerName()
			{
				return playerName;
			}

		public void setPlayerName(String playerName)
			{
				this.playerName = playerName;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getType()
			{
				return type;
			}

		public  void setType(String type)
			{
				this.type = type;
			}

		public  double getAttack()
			{
				return attack;
			}

		public void setAttack(double attack)
			{
				this.attack = attack;
			}

		public double getDefense()
			{
				return defense;
			}

		public void setDefense(double defense)
			{
				this.defense = defense;
			}

		public double getSpeed()
			{
				return speed;
			}

		public void setSpeed(double speed)
			{
				this.speed = speed;
			}

		public double getHealth()
			{
				return health;
			}

		public void setHealth(double health)
			{
				this.health = health;
			}

}
