package lab4;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) 
	{
		Random generator = new Random();
		int num1 = generator.nextInt(7)+4;
		System.out.println("The range is 3 to 10: "+ num1);
		int num2 = generator.nextInt(23)+22;
		System.out.println("The range is 21 to 44: "+ num2);
		int num3 = generator.nextInt(50)-20;
		System.out.println("The range is -20 to 30: "+ num3);
	}

}
