package lab4;
import java.util.Scanner;
public class QuadraticFormula {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = scan.nextInt();
		System.out.println("Enter b:");
		int b = scan.nextInt();
		System.out.println("Enter c:");
		int c = scan.nextInt();
		double quadratic = (-b+ Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		System.out.println("The first root is: " + quadratic);
		double quadratic1 = (-b- Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		System.out.println("The second root is: " + quadratic1);
	}

}
