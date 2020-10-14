package project2;

public class Casual extends Custom{
	public String[] names;
	public int nums;
	public int buyNums() {
		int num=0;
		while(num==0) {
			num=(int)(Math.random()*4);
		}
		return num;
	}
	public Casual() {
		super.nums=buyNums();

		super.names=buyNames(1);
	}


}
