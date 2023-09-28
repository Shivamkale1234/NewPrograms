package StarPaternExs;

public class StarPatternEx25 {
	
	public static void main(String[] args) {
		
		int i,j,n=5;
		
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=n; j++)
			{
				if(j==1 || j==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
			
	}

}
