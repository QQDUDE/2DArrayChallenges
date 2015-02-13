
public class challenge3
	{

		public static void main(String[] args)
			{
				int arrayName [] [] = new int [3] [3];
				int counter = 1;
				for(int row =0; row < arrayName.length; row++) 
					{
						for (int col=0; col < arrayName[0].length; col++)
							arrayName[row][col]= counter;
				counter++;	
					}
					
			System.out.println(counter);
			}
			

	}
