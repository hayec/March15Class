package captain;

public class makeACaptain 
{
	private static makeACaptain _captain;
	private makeACaptain(){};
	public static makeACaptain getCaptain()
	{
		if(_captain == null)
			_captain = new makeACaptain();
		else
			System.out.println("We already have a captain");
		return _captain;
	}
}
