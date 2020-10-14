package project1;

import java.util.ArrayList;
import java.util.List;

/*
 * The abstract class Employee, which has all the abstract methods of zookeeper, 
 * such as arrive, wake, feed, rollcall, exercise, tellsleep, leave, setDay, etc.
 */
public abstract class Employee implements Observerable 
{
   private List<Observer> list= new ArrayList<>(); ;
   
   private String message;
   
   

   public Employee(String name)
   {
   }
   
   public abstract void arrive();
   
   public abstract void wake(Animal[] animalArray);
   
   public abstract void feed(Animal[] animalArray);
   
   public abstract void rollCall(Animal[] animalArray);
   
   public abstract void exercise(Animal[] animalArray);
   
   public abstract void tellSleep(Animal[] animalArray);
   
   public abstract void leave();

   public abstract void setDay(int day);

   public abstract void behavior(Animal[] animalArray);

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		list.add(o);
		
	}
	
	
	
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		 if(!list.isEmpty())
	         list.remove(o);
		
	}
	
	
	
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++) {
	        Observer oserver = list.get(i);
	        oserver.update(message);
	    }
		
	}
	
	public void setInfomation(String s) {
	    this.message = s;
	    notifyObserver();
	
	
	}
}