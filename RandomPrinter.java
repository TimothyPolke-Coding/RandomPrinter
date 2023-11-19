import java.util.Scanner;
import java.security.SecureRandom;

public class RandomPrinter
{
	public static void main(String[] args)
	{		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter size of code: ");	
		
		String text = input.nextLine();
		
		int length = 0;
	
		try
		{
			length = Integer.parseInt(text);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Your entry was invalid!");
			System.exit(0);
		}
		if (length <= 0)
		{
			System.out.println("Size of code MUST be greater than 0!");
			System.exit(0);
		}
	
		char [] charactersallowed = "abcdefghijklmnopqrstuvwxyzABCDEFGJKLMNPRSTUVWXYZ0123456789".toCharArray();
		
		SecureRandom random = new SecureRandom();
		
		StringBuilder code = new StringBuilder();
			
		for (int i = 0; i < length; i++) 
		{
			code.append(charactersallowed[random.nextInt(charactersallowed.length)]);
		}
		
		System.out.println(code.toString());
	}
}