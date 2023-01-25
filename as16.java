/*//16. Write a java program to print numbers between 1 to 100 which are divisible by3; 5 and by both.
class as16{
	public static void main(String[] args){
		int i = 0;
		while(i <= 100){
			if (i%3 == 0){
				if (i % 5 == 0){
					System.out.println(i);
				}
			}
			i++;
		}
	}
}
*/
class as16{
	public static void main(String[] args){
		int count=0;
		for(int i=0;i<= 100;i++){
			if (i % 3==0 && i%5 ==0){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total count:"+count);
	}
}


			