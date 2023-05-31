package mainPrograms;

public class PalindromeNumber 
{
	
	public static void main(String[] args) 
	{
		int orgnum = 1321;
		int num = orgnum;
		int rev=0;
		
		while(num!=0)
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		
		if(orgnum==rev)
		{
			System.out.println(orgnum+":- is an palindrome number");
		}
		else
		{
			System.out.println(orgnum+":- is not an palindrome number");
		}
		 
		
	}

}
