//35. Is it possible to declare array size as negative?
class as35{
public static void main(String[] args){
	int a[] = new int[-4];
	System.out.println(a[1]);
}
}

/*Exception in thread "main" java.lang.NegativeArraySizeException: -4
        at as35.main(as35.java:4)
*/