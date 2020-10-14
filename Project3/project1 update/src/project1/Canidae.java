package project1;

/*
Canidae extends Animals£¬
Mainly implement the exercise of the subject
 */
public class Canidae extends Animal {

	public Canidae(String myName) {
		super(myName);
		// TODO Auto-generated constructor stub
	}
	
    public void exercise()
    {
    	//Generate a random number between 0-100 and
    	//use this as a probability to judge the behavior of the animal.
    	int randomNum=(int) (Math.random() * 100);
    	if(randomNum<25)
    	{
    		System.out.println(name+" dig.");
    	}
    	else
    	{
    		System.out.println(name+" roam.");
    	}
    		
    }
}
