//15. Write a Java program to print first 5 values which are divisible by 2; 3 and 5
/*class as15{
	public static void main(String[] args){
	int num = 0;
	while (num < 100){
		if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0){
			System.out.println(num);
			
		}
		num++;
	}
	}
}
*/
class as15{
	public static void main(String[] args){
		int count =0;
		for (int num=1;num<=500;num++){
			if (num % 2 == 0){
				if (num % 3 == 0){
					if (num % 5 == 0){
						System.out.println(num);
						count += 1;
						if (count == 5){
		                 System.out.println("okk");
						 break;
					}
				}
			}
		
			
		}
		}
		
	
		
	}
}
