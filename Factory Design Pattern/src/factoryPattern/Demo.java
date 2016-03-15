package factoryPattern;
import java.util.Scanner;
public class Demo 
{
	public static void main(String[] args) 
	{
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;
		Scanner keyboard = new Scanner(System.in);
		while(true)
		{
			System.out.print("What type of ship?(U/R/H) : ");
			if(keyboard.hasNext())
			{
				theEnemy = shipFactory.makeEnemyShip(keyboard.nextLine());
				if(theEnemy != null)
					doStuffEnemy(theEnemy);
				else
					System.out.println("Please enter a valid character!");
			}
		}
	}
	public static void doStuffEnemy(EnemyShip enemy)
	{
		enemy.displayEnemyShip();
		enemy.followHeroShip();
		enemy.enemyShipsShoots();
	}

}
