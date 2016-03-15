package captain;

public class Demo {

	public static void main(String[] args) 
	{	
		makeACaptain c1 = makeACaptain.getCaptain();
		System.out.println("Try to make another captain");
		makeACaptain c2 = makeACaptain.getCaptain();
		if(c1 == c2)
		{
			System.out.println("They are the same captain.");
		}
	}

}
