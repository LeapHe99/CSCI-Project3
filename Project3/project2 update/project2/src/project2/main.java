package project2;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;

public class main {


	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String path = "D:/dayatthestore.out"; 
	    FileOutputStream puts = new FileOutputStream(path,true);
	    PrintStream out = new PrintStream(puts);
	    System.setOut(out);
		Store store=new Store();
		for (int j=0;j<30;j++) {
			System.out.println("--------------------");
			System.out.println("Day "+(j+1));
			CustomFactory custom=new CustomFactory();
			
			Custom casual=custom.generateCustom("casual");

			Custom business=custom.generateCustom("business");

			Custom catering=custom.generateCustom("catering");
			
			for(int i=0;i<casual.names.length;i++){
				store.sell(casual.names[i],casual.nums);
			}
			for(int i=0;i<business.names.length;i++){
				store.sell(business.names[i],business.nums);
			}
			for(int i=0;i<catering.names.length;i++){
				store.sell(catering.names[i],catering.nums);
			}
			store.supply();
		}
		
	}


}
