package lab4;

public class StringMethodsTest {

	public static void main(String[] args)
	{
		String phrase ="Change is inevitable";
		String mutation1, mutation2, mutation3;
		System.out.println("The string is: "+ phrase);
		System.out.println("The length of the strins is: "+phrase.length());
		mutation1 = phrase.concat(" except from vending machines");
		System.out.println("The concatenation is: "+ mutation1);
		mutation2 = mutation1.toUpperCase();
		System.out.println("Changing to upper case "+ mutation2);
		mutation3 = mutation1.substring(3);
		System.out.println("The length of string 1 is: "+ mutation1.length());
		System.out.println("The length of string 2 is: "+ mutation2.length());
		System.out.println("The length of string 3 is: "+ mutation3.length());
	}

}
