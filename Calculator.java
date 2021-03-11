import java.util.Scanner;


class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader =new Scanner(System.in);
		System.out.println("Enter two numbers ");
		double first = reader.nextDouble();
		double second = reader.nextDouble();
		System.out.println("Enter an operator like (+,-,/,*)");
		char operator = reader.next().charAt(0);
		double result;
		switch (operator)
		{
		case '*':
		result = first * second ;
		break;
		
		case '/':
			result = first / second ;
			break;
			
		case '-':
			result = first - second ;
			break;
			
		case '+':
			result = first + second ;
			break;
			
			default:
				System.out.println("Error! operator is not correct");
				return;
		}
		System.out.println( first + " "+ operator + "" + second +" = " +result );	
	}
}