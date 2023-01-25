//10. Write a program to print the given 3 numbers in ascending orders?
class as10{
public static void main(String[] args){
	int val1 = 106;
	int val2 = 102;
	int val3 = 19;
	if (val1 < val2 && val1 < val3){
		if (val2<val3){
			System.out.println("hello:"+val1+" "+val2+" "+val3);
			//System.out.print("In order " + z + " "+ y + " " + x);
		}
		else{
			System.out.println(val1+" "+val3+" "+val2);
		}
	}
	else if (val2 < val1 && val2 < val3){
		if (val1 < val3){
			System.out.println(val2+" "+val1+" "+val3);
		}
		else{
			System.out.println(val2+" "+val3+" "+val2);
		}
	}
	else if (val3 < val1 && val3 < val2){
		if (val2 <val3){
			System.out.println(val3+" "+val2+" "+val1);
		}
		else{
			System.out.println(val3+" "+val2+" "+val1);
		}
	}

}
}