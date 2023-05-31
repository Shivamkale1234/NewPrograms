package MyMainPrograms;

public class PrimeNumber {
	
	public static void main(String args[])
	{
			int l = 2;
			int h = 100;
		
		    while (l <= h)                      //2 <= 100
		    {
		
			boolean isPrime = true;
			for (int i = 2; i <= l / 2; i++) {

			    if (l % i == 0)                 //2 % 2 == 0
			    {
				isPrime = false;
				break;
				}
			}
			if (isPrime && l > 1) 
			{
				System.out.println(l);
			}
			l++;
		}
	}
	/*
     *  num 5 >> a=0 >> i=2 true >> 5%i= - 5%3 -5%4 == 1  2  1
     *  num 10 >> a=0 >> 10%2 = 0 >>a=1 --10%3=1 -10
     */

}
