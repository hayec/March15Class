package factoryPattern;

public class EnemyShipFactory 
{
	public EnemyShip makeEnemyShip(String newShipType)
	{
		EnemyShip newShip = null;
		if(newShipType.equals("U"))
			newShip = new UFOEnemyShip();
		else if (newShipType.equals("R"))
			newShip = new RocketEnemyShip();
		else if (newShipType.equals("H"))
			newShip = new HugeUFOEnemyShip();
		return newShip;
	}
}
