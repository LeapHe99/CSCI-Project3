package project1;

import java.util.List;

/*
 * extends Employee,Implemented the abstract method in Employee
 */
public class Zookeeper extends Employee{
	
	
	private int day;
	private String name;
	

	public Zookeeper(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name=name;
	}


	   
   @Override
	public void setDay(int day) 
	{
		this.day=day;
	}

   @Override
   public void arrive()
   {
	   setInfomation(" arrive Zoo");
	   System.out.println(this.name+" arrive at Zoo on day "+this.day);
   }
   @Override
   public void wake(Animal[] animalArray)
   {
	   for (int i=0;i<animalArray.length;i++)
	   {

		   setInfomation(" wake up");
		   System.out.println(this.name+" wake up "+animalArray[i].name);
		   animalArray[i].beWaked();
	   }
	   
   }
   @Override
   public void behavior(Animal[] animalArray)
   {
	   for (int i=0;i<animalArray.length;i++)
	   {
		   setInfomation(" see animal behaivior");
		   animalArray[i].doBehaivior();
	   }
   }
   
   @Override
   public void feed(Animal[] animalArray)
   {
	   for (int i=0;i<animalArray.length;i++)
	   {
		   setInfomation(" feed animal ");
		   System.out.println(this.name+" feed "+animalArray[i].name);
		   animalArray[i].eat();
	   }
   }
   @Override
   public void rollCall(Animal[] animalArray)
   {
	   for (int i=0;i<animalArray.length;i++)
	   {
		   setInfomation(" rollcall animal ");
		   System.out.println(this.name+" rollCall "+animalArray[i].name);
		   animalArray[i].speek();
	   }
   }
   @Override
   public void exercise(Animal[] animalArray)
   {
	   for (int i=0;i<animalArray.length;i++)
	   {
		   setInfomation(" excercise animal ");
		   System.out.println(this.name+" excercise "+animalArray[i].name);
		   animalArray[i].exercise();
	   }
   }
   @Override
   public void tellSleep(Animal[] animalArray)
   {
	   for (int i=0;i<animalArray.length;i++)
	   {
		   setInfomation(" let animal go to sleep ");
		   System.out.println(this.name+" let "+animalArray[i].name +" go to sleep.");
		   animalArray[i].sleep();
	   }
   }
   
   @Override
   public void leave()
   {
	   setInfomation(" leave Zoon");
	   System.out.println(this.name+" leave the Zoo on day "+this.day);
   }

   //Zookeeper's daily workflow



   }


