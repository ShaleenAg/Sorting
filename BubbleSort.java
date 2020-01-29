import java.util.Arrays;
public class BubbleSort {
	
	
	
	
	void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                   
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
	
	
	
	
    }public static void main(String args[]) {
    	BubbleSort b = new BubbleSort();
    	int a[] = {89,8,7,6,5,4,3,2};
    	b.bubbleSort(a);
    	System.out.println(Arrays.toString(a));
    	
    }

}
