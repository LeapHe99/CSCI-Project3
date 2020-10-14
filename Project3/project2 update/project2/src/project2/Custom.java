package project2;

public class Custom {
	public int nums;
	public String[] names;
	
	public String[] buyNames(int categoryNum) {

		String[] name= {"spring","egg","pasty","sausage","jelly"};
		String [] buyName=new String[categoryNum];
		for(int i=0;i<categoryNum;i++) {
			int num = (int)(Math.random() * 1000);
			while (num>name.length-1) {
				if (num<=name.length-1) {
					break;
				}
				num = (int)(Math.random() * 1000);
			}
			
			buyName[i]=name[num];
		}
		return buyName;
	}
}
