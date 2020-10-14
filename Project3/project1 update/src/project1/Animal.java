package project1;

/*
The general parent category of all animals, 
which includes basic animal names, sleeping, eating, exercise, wake and other methods.
*/
public class Animal { 
	Behavior behavior;
    public String name; 
    
    //Construction method
    public Animal(String myName) { 
        name = myName; 
    } 
    public void eat(){ 
        System.out.println(name+" is eatting food."); 
    }
    public void sleep(){
        System.out.println(name+" go to sleeping.");
    }
    public void beWaked() { 
        System.out.println(name + " is waked."); 
    } 
    public void exercise()
    {
    	System.out.println(name + " is excercising."); 
    }
	public void speek() {
		// TODO Auto-generated method stub
		System.out.println(name + "  shout"); 
	}
	
	public void setBehavior(Behavior b) {
		behavior=b;
	}
	
	public void doBehaivior() {
		behavior.behavior();
	}

}