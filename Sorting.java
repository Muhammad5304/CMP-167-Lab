import java.util.Arrays;

public class Sorting {

	public static void bubbleSort(int [] arr) {
		
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n -i -1; j++) {
				
				if (arr[j] > arr[j+1]) {
				//Swap
				//int temp = arr[j];
				arr[j] = arr[j] ^ arr[j+1]; 
				arr[j+1] = arr[j] ^ arr[j+1];
				arr[j] = arr[j] ^ arr[j+1];

				}
			}
		}
	}
	
	//ASSIGNMENT:
	//Implement and research about the insertionSort and SelectionSort
	
	public static void main(String[] args) {
		int[] numbers = {4, 1, 2, 3, 5};
		bubbleSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	
	
}
