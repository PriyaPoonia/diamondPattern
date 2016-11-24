
public class diamonddesignDemo {

	public static void main(String[] args) {
		
		// for upper diamond(upper left portion)
				
	for( int i= 1; i<6;i++)           // for row
	{
		for(int j=5 ;j > 0; j--)            // for column
		{
				if (j>i)
					{
						System.out.print("   ");
					}
				else
					{
						System.out.print(j + "  ");
				
					}
		}
		
		// for upper diamond(upper right portion)
		
		for( int j= 2; j<= i; j++)
			{
				System.out.print( j + "   ");
			}
		System.out.println("\n");          // line break or next line
		         
	}
	
		// for lower diamond(lower left portion)
	
	for(int i =4; i>0 ;i--) 		// for row
	{
		for(int j=5; j >0; j--)			// for column
		{
			if(j>i)
			{
				System.out.print("   ");
				
			
			}
			else
			{
				System.out.print( j +"  ");
			}
		}
		
			// for lower diamond(right portion)
		
		for(int j=2; j<=i; j++)
			{
				System.out.print( j+"   ");
			}
		System.out.println("\n");
		
	}
	
}
	
	
	}



