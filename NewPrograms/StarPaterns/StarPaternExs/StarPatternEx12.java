package StarPaternExs;

public class StarPatternEx12 {

	public static void main(String[] args) {
		
			int i,j,row=5;
			
			for(i=1; i<=row; i++)
			{
				for(j=5; j>=i; j--)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
				
		}

}
