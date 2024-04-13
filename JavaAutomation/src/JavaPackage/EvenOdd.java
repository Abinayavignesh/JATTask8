package JavaPackage;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int value = scan.nextInt();
		if(value%2==0) {
			System.out.println("The number is a Even number :" + value);
		}


	}

}
