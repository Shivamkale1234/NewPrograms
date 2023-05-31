package mainPrograms;

public class ReverseString 
{
	
	public static void main(String[] args) 
	{
		 String org = "abcd";  //index 0 to 3   dcba
		 String rev = "";      //d
		 
		                //4-1 = 3  -1>=0  0
		 for(int i=org.length()-1; i>=0; i--)
		 {
			 rev=rev+org.charAt(i);
			 System.out.println(rev);
		 }
		 //rev=""+d=d
		 //rev="d"+c=dc
		 //rev="dc"+b=dcb
		 //rev="dcb"+a=dcba
		 System.out.println("-------");
		 System.out.println(rev);
		 
	}

}
