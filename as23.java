//23. Write a program to print 1 to 10 even numbers using a while loop
class as23{
public static void main(String[] args){
	int count = 0;
	int i =1;
	while (i<100)
	{
		if(i%2==0)
		{
			System.out.println(i);
			count = count + 1;
			if (count == 10)
			{
				System.out.println("okk");
				break;
			}
		}
		i++;
	}
}
}
/*
class as23{
public static void main(String[] args){
	int count = 0;
	for (int i=1;i<100;i++){
		if(i%2==0){
			System.out.println(i);
			count++;
			if (count == 10){
			System.out.println("okk");
			break;
		}
		}
		
	}
}
}
		*/