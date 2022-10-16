package assignment1;


/*assignment for the print Prime number between 1 to 1000    */

public class Task6 {

	public static void main(String[] args) {
		
		int i,j;
		
		
		for(i=2;i<1000;i++)
		{
			int count=0;
			for(j=2;j<i;j++)
			{
				
				if(i%j==0)
					count=1;
				break;
					
			}
			
			if(count==0)
				System.out.println(i);
			
		}
		
		
	}

}
