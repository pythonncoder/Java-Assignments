// 28. Write a program to print reverse of digits of numbers
class as28{
	public static void main(String[] args){
		int num = 12345;
		int rem = 0;
		int rev = 0;
		while (num > 0){
			rem = num % 10;
			rev = rev*10 + rem;
			num = num / 10;
		}
		
		System.out.println(rev);
	}
}
/*
class as28{
	public static void main(String[] args){
		int num = 12345;
		int rem = 0;
		int rev = 0;
		for (int i=0;i<=num.length;i++){
			rem = num % 10;
			rev = rev*10 + rem;
			num = num / 10;
		}
	}
}*/



		
			                                      
			
			