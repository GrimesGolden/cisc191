class Pig extends Animal
			implements Flight {

	String species = "Pig";
	int height = 5;
	double speed = 1.5;
	
	String eat() {
		String message = ("The " + this.species + " consumes truffles");
		return message;
	}

	String forage() {
		String message = "Commence foraging for truffles.";
		return message;
	}

	public String flight() {

		String message = "The " + this.species + " takes flight!!!";
		return message;
	}



	public static void main (String[] args)
	{	
		Pig pig = new Pig();

		System.out.println(pig.flight());
	}
}
