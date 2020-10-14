package project1;

public class ZooClock {
	private int time=7;
	public int announceTime()
	{
		time+=1;
		System.out.println("The time is "+time);
		return time;
	}

}
