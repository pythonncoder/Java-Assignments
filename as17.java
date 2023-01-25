//17. Java Program for Find largest prime factor of a number?
class as17{
public static void main(String[] args){
	int value = 540;
	for (int i=2;i<=value;i++){
		while(value % i == 0){
			value = value / i ;
			System.out.println(i);
		}
	}
	
}
}
			