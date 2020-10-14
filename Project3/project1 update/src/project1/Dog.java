package project1;

//extends Canidae ,realize the speek of dog
public class Dog extends Canidae {

	public Dog(String myName) {
		super(myName);
		// TODO Auto-generated constructor stub
	}
	//realize the speek of cat
	@Override
	public void speek()
	{
		System.out.println(name+" wang wang.");
	}

}
