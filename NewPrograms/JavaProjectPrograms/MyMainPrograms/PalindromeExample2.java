package MyMainPrograms;

public class PalindromeExample2 {
	
	 public static void main(String args[])  
	   {  
		    String name = "appkppa", rev="";
	        int length = name.length();
	        
	        for(int i = length-1; i>=0; i--)
	        rev = rev + name.charAt(i);
	        
	        if(name.equals(rev))
	        {
	        	System.out.println(name+ ": is an palindrone name");
	        }
	        else
	        {
	        	System.out.println(name+ ": is not an palindrone name");
	        }
	   }
	  

}


































/*String numORtext="shivamkmavihs", reverse="";   // Objects of String class
 
int length = numORtext.length();                // add (obj.length())

for ( int i = length - 1; i >= 0; i-- ) 
   reverse = reverse + numORtext.charAt(i);     // add (reverse + obj.CharAt(i))

if (numORtext.equals(reverse))                  // add (obj.equals(reverse))
   System.out.println(numORtext +" Entered numORtext is a palindrome.");  
else  
   System.out.println(numORtext +" Entered numORtext is not a palindrome."); */