package mainPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		 
		int orgnum = 1234;     
		int revnum=0;
		       
		for(int i=orgnum;  i>0;  i=i/10)
		{
			int rem = i%10;             
			revnum = revnum*10 + rem;   
		}
		
		System.out.println(revnum);
		
		
		//logic1: get last digit from org num
		//int rem = orgnum % 10;   //1234 % 10 = 4
		//System.out.println(rem);
		
		//logic2: remove last digit from org num
		//orgnum=orgnum/10;        //1234 / 10 = 123
		//System.out.println(orgnum);

	}

}
