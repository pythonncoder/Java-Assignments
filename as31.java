//31. Write a program to check if a given number is an Armstrong number or not
import java.util.*;
import java.util.Scanner;

class as31{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    int num = sc.nextInt();
	int rem = 0;
	int rev = 0;
	
	while (num != 0){
		rem = num % 10;
		rev = rev * 10 + rem;
		num = num / 10;
	    System.out.println(rev +" ");
		
		if (rev == num){
		System.out.println("Armostong Number");
	}
	 
	}
	
}
}
		
		
	