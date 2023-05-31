package MyMainPrograms;

public class PalindromeExample {
/* A palindrome number is a number that is [same after reverse]. 
 * For example 
 * 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.*/
	
	public static void main(String[] args) {
		
		int num = 13531;
		int temp=num;        //temp=121
		int rev=0,rem;
		
		while(temp!=0)       //condition 121!=0
		{
			rem=temp%10;     //rem=121%10 = 12.1
			rev=rev*10+rem;  //rev=0*10+1 = 1
			temp=temp/10;    //temp=0/10  = 0
		}
		
		if(num==rev)
		{
			System.out.println(num +  " : is a palindrome number");
		}
		else
		{
			System.out.println(num + " : is not a palindrome number");
		}
		
	}
}


























