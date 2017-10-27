public class Chicken
{
	//variables y metodos con miniscula
	//clases con mayusucula
	//clases upercamelcase
	//atributos lowwecamelcase
	//metodos lowercamelcase
	//variables lowercamelcase
	
		private String name;
		private String color;
		private int age;
		
		public void initializaData (String name, String color, int age)
		{
			this.name=name;
			this.color=color;
			this.age=age;
			
		}

		public void layAnEgg()
		{
			System.out.println("The chicken " + name + " lay an egg");
		}
		public void poop()
		{
			System.out.println("The Chicken " + name + " pooped");
		}
		public void drink()
		{
			System.out.println("The chicken " + name + " drank");
		}
		public void showData()
		{
			System.out.println("The name of the chicken is:  " + name + ", Color:  " + color + ", The birhday: " + age);
		}


}