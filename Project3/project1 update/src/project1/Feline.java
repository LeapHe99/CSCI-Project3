package project1;


/*
Feline extends Animals£¬
Mainly implement the exercise of the subject
 */
public class Feline extends Animal { 
    public Feline(String name) { 
        super(name); 
    } 
    
    public void exercise()
    {
    	//Generate a random number between 0-100 and
    	//use this as a probability to judge the behavior of the animal.
    	int randomNum=(int) (Math.random() * 100);
    	if(randomNum<30)
    	{
    		System.out.println(name+" roam.");
    	}
    	else if(randomNum<60)
    	{
    		System.out.println(name+" make noise.");
    	}
    	else
    	{
    		System.out.println(name+" go to sleep.");
    	}
    		
    }
}