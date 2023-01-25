/*27. Write a program Factors of 24 using while loop
a. (Factors of 24 are 1,2,3, 4, 6, 12, 24)
*/

class as27{
public static void main(String[] args){
	int num = 24;
	for(int i = 1; i< num;i++){
		if (num % i == 0){
			System.out.print(i +" ");
		}
	}
}
}
