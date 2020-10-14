package project2;
import java.util.Map;
import java.util.HashMap;
public class Store {
	Map<String, Integer> rollNums = new HashMap<>();
//	public int sprintRolls;
//	public int eggRolls;
//	public int pastyRolls;
//	public int sausageRolls;
//	public int jellyRolls;
	
	public Store() {
		this.rollNums.put("spring",30);
		this.rollNums.put("egg",30);
		this.rollNums.put("pasty",30);
		this.rollNums.put("sausage",30);
		this.rollNums.put("jelly",30);
		
	}

	public boolean checkClose() {
		for (Map.Entry<String, Integer> entry:rollNums.entrySet()) {
		    String mapKey = entry.getKey();
		    int mapValue = entry.getValue();
		    if(mapValue!=0) {
		    	return false;
		    }
		}
		return true;
	}
	
	public void sell(String rollName,int buynum) {
		boolean isClosed=checkClose();
		if( isClosed) {
			System.out.println("The store have closed!");
		}
		int num=rollNums.get(rollName);
		if(num>buynum) {
			rollNums.replace(rollName, num-buynum);
		}
		
		else {
			if(num>0) {
				rollNums.replace(rollName, 0);
				System.out.println(rollName+" is not enough!");
			}
			else {
				System.out.println(rollName+" have sold empty!");
			}
		}
	}
	
	public void supply() {
		for (Map.Entry<String, Integer> entry:rollNums.entrySet()) {
		    String mapKey = entry.getKey();
		    int mapValue = entry.getValue();

	    	System.out.println(mapKey+" remain "+mapValue);
		    if(mapValue==0) {
		    	rollNums.replace(mapKey, 30);
		    	System.out.println("supply "+mapKey);
		    }
		}
	}
}