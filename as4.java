//4. Write a program to check if a number is 3-digit numbers or not?
import java.util.Scanner;
class as4{
	public static void main(String[] args){
		int val = 123456;

		int count = 0;
	
	while(val > 0){
		val = val / 10;
	    count ++;
	}
	System.out.println(count);
	}
}

		
		
		