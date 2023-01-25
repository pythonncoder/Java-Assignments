//Write a program to print the given 3 numbers in descending orders?
class as11{
public static void main(String[] args){
	int val1=102;
	int val2=99;
	int val3= 106;
	if (val1 > val2 && val1 > val3){
		if(val2 > val3){
			System.out.println("hello:"+val3+" "+val2+" "+val1);
		}
		else{
			System.out.println("hello:"+val2+" "+val3+" "+val1);
		}
	}
	else if (val2 > val1 && val2 > val3){
		if (val1 > val2){
			System.out.println("sdbjcbjs:"+val1+" "+val3+" "+val2);
		}
		else{
			System.out.println(" hjbjwebj:"+val3+" "+val1+" "+val2);
		}
	}
	else if (val3 >val1 && val3 >val2){
		if (val2 > val3){
			System.out.println("sdbjcbjs:"+val1+" "+val2+" "+val3);
		}
		else{
			System.out.println(" hjbjwebj:"+val2+" "+val1+" "+val3);
		}
		
	}


}
}