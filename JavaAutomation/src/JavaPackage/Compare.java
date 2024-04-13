package JavaPackage;

public class Compare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number:");
		int a=sc.nextInt();
		System.out.println("Enter the Second number:");
		int b=sc.nextInt();
		System.out.println("Enter the Third number:");
		int c=sc.nextInt();
		System.out.println("Enter the Fourth number:");
		int d=sc.nextInt();
		int first=a+b;
		int second=c+d;
		if(first>second) {
			System.out.println("Sum of a+b is greater"+ first);
		}
		else
		{
			System.out.println("Sum of c+d is greater"+ second);
		}


	}

}
