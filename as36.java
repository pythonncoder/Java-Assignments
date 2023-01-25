//36. How to copy an array in Java?
/*class as36{
public static void main(String[] args){
	int a[] = new int[4];
	a[0] = 1;
	a[1] = 2;
	a[2] = 3;
	a[3] = 4;
	int []b =a;
	for (int i:b){
		System.out.print("b:" +i +" ");
	}
	for (int j:a){
		System.out.print("a :" +j + " ");
	}	
}
}

*/
class as36{
public static void main(String[] args){
	int c[] = {12,45,64,67};
	int[] d = new int[3];
	System.out.println(d.length);
	for (int i=0;i<d.length-1;i++){
		d[i]=c[i];
		}
		for (int i:d){
			System.out.print(d[i]);
		}

}
}
	
