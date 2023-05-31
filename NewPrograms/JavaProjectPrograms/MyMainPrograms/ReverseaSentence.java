package MyMainPrograms;

/*  Input :  I am a programmer
 *  Output: programmer a am I
 */

public class ReverseaSentence {
	
	public static void main(String args[]){
	    
			System.out.print("Enter a sentence: ");
			
			String name = " i am shivam kale ";
			String reversed = " ";
			
			while(name.indexOf(" ") != -1)
			{
			  int idx = name.indexOf(" ");
			  String word = name.substring(0, idx);
			  reversed = word + " "+ reversed;
			  name = name.substring(idx+1);
			}
			System.out.print("Reverse: ");
			System.out.println(reversed);
		}
	}

