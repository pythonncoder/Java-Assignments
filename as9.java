//9. Write a program to print the least number in given three numbers?
class as9{
public static void main(String[] args){
	int val1 = 101;
	int val2 = 102;
	int val3 = 103;
	if (val1 < val2 && val1 < val3){
	System.out.println(val1);
	}
	else if (val2 < val3 && val2 < val1){
		System.out.println(val2);
	}
	else{
		System.out.println(val3);
	}
		
		

}
}