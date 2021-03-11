import java.util.Scanner;


public class Reversestring {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter a Word");
		char[] letters = Scanner .nextLine().toCharArray();
		System.out.println("Reverse String:");
		for(int i= letters.length -1;i>=0;i--)
		{
			System.out.print(letters[i]);
		}
	}

}
