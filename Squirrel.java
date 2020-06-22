public class Squirrel extends Animal {

	String species = "Squirrel";
	int height = 3;
	double speed = 3.0;
	
	String eat() {
		String message = ("The " + this.species + " consumes acorns");
		return message;
	}

	String climb() {
		String message = "The Squirrel is climbing a tree";
		return message;
	}

	public static void main (String[] args)
	{	
		Squirrel squirrel = new Squirrel();

		System.out.println(squirrel.eat());
	}
}
