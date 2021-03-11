import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%2==0)
		{
			System.out.println("Entered Number is Even:");
		}
		else
		{
			System.out.println("Entered Number is odd");
		}
	}

	
}
