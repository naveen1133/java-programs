
public class bubbleSort {

	public static void main(String[] args) {
		// bubble sorting
		int[] intArray = {20,35,-15,7,55,1,-22};
//Logic for the bubble sort	-- swapping the 2 adjacent elements of an unsorted elements	
		for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex>0; lastUnsortedIndex--)
		{
			for(int i = 0; i<lastUnsortedIndex;i++)
			{
				if(intArray[i]>intArray[i+1])
				{
					swap(intArray,i,i+1);
				}
			}
		}
		
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
		
	}
		
		public static void swap(int[] array , int i, int j)
		{
			if(i==j) {
				return;
			}
			int temp=array[i];
			array[i]=array[j];
			array[j]= temp;

	}

}
