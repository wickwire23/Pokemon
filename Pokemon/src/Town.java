import java.util.ArrayList;
import java.util.Scanner;
public class Town
	{
		 String number;
		 String townName;
		 String difficulty;
		 public Town (String a, String b , String c)
				{
					number=a;
					townName=b;
					difficulty=c;
				}
		public String getNumber()
			{
				return number;
			}
		public void setNumber(String number)
			{
				this.number = number;
			}
		public String getTownName()
			{
				return townName;
			}
		public void setName(String townName)
			{
				this.townName = townName;
			}
		public String getDifficulty()
			{
				return difficulty;
			}
		public void setDifficulty(String difficulty)
			{
				this.difficulty = difficulty;
			}
	
	}