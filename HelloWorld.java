public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("Hello Jonathan");
		Chicken chicken = new Chicken();
		chicken.initializaData("lucy","coffe",2);
		chicken.showData();
		
		Chicken chicken1 = new Chicken();
		chicken1.initializaData("pepa","black & white",3);
		chicken1.poop();

		Chicken chicken2 = new Chicken();
		chicken2.initializaData("lucia","coffe & white",4);
		chicken2.drink();
		
		Chicken chicken3 = new Chicken();
		chicken3.initializaData("juana","white",5);
		chicken3.layAnEgg();
		
		System.out.println("Chao Jonathan");
	}

}