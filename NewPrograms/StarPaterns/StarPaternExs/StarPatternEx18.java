package StarPaternExs;

public class StarPatternEx18 {
	
      public static void main(String[] args) {
		
		int i,j,k,l,row=5;
		
		for(i=1; i<=row; i++)
		{
			for(j=2; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(k=5; k>=i; k--)
			{
				System.out.print("*");
			}
			for(l=4; l>=i; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
}
}
