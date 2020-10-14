package project1;

//extends Feline ,realize the speek of cat
public class Cat extends Feline {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	//realize the speek of cat
	@Override
	public void speek()
	{
		System.out.println(name+" miao miao.");
	}

}
