/*//30. Write a program to print the Fibonacci number series up to a given number
a. Expected out 17 -: 0 1 1 2 3 5 8 13

class as30{
public static void main(String[] args){
	int a = 0;
	int b = 1;
	int c = 0;
	for (int i =0; i<= 10; i++){
		System.out.print(a + " ");
		a = b;
		b = c;
		c = a+b;
		if (a > 17){
			System.out.println("okk");
			break;
		}
	}
		
	}
}
*/

class as30{
public static void main(String[] args){
	int a = 0;
	int b = 1;
	int c = 0;
	int i = 0;
	while (true){
		System.out.print(a + " ");
		a = b;
		b = c;
		c = a+b;
		if (a > 17){
			System.out.println("okk");
			break;
		}
	}
}
}

		
