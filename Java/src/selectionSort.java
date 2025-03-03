
public class selectionSort {

	public static void main(String[] args) {
		// selection Sort -- sorting to select the smallest/largest element
		
		int[] intArray = {20,35,-15,7,55,1,-22};
		for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex>0; lastUnsortedIndex--)
		{
			int l=0;
			for(int i=0; i<=lastUnsortedIndex; i++)
			{
				if(intArray[i]>intArray[l]) {
				l=i;
			}
			}
			swap(intArray,l,lastUnsortedIndex);
			
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