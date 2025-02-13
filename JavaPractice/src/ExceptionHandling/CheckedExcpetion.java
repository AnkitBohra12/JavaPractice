package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExcpetion {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("program is started.....");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		FileInputStream file = new FileInputStream("c:\\tst.txt");	
		
		System.out.println("program is ended.....");
	}

}
