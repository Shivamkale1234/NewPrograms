package StarPaternExs;

public class StarPatternEx19 {

	public static void main(String[] args) {
		
		int i,j,k,l,row=5;
		
		for(i=1; i<=row; i++)
		{
			for(j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(l=2; l<=i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1; i<=row; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(k=4; k>=i; k--)
			{
				System.out.print("*");
			}
			for(l=3; l>=i; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
