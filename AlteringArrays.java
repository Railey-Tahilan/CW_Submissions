
public class AlteringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int[] nums = {5,0,8,20};
		int[] difference = subtract5FromAll4(nums) ;
		System.out.print (difference[0] + "," + difference[1] + "," + difference[2] + "," + difference[3]) ;
		
		
			}
				
			
			public static int[] subtract5FromAll4(int[]arr)
			{

				int[]copyArr=new int[arr.length];
				
				for(int i=0;i<copyArr.length;i++)
				{
					copyArr[i]=arr[i]-5;
				}
				return copyArr;
			}
		}
	

