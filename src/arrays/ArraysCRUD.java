package arrays;

import java.util.Arrays;

public class ArraysCRUD {

	public static void main(String[] args) {
		int arr1[] = new int[6];
		int n = 0;
		arr1[0] = 10;
		arr1[2] = 20;
		arr1[3] = 30;
		arr1[4] = 40;
		System.out.println("Printing array before insertion");
		n = 4;
		print(arr1, n);
		
		int pos = 2;
		int newElement = 50;
		
		for(int i = n; i<pos; i++) {
			arr1[i] = arr1[i-1];
			}
		n++;
		arr1[pos-1]=newElement;
		System.out.println("\nPrinting elements after insertion");
		print(arr1, n);
		
		System.out.println("\nPrinting elements after deletion");
		for(int i = pos-1; i<n; i++) {
			arr1[i] = arr1[i+1];
			}
		n--;
		print(arr1,n);

		
		System.out.println("\nPrinting arrays using the Utils class");
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("\nPrinting Array after sorting");
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("\nPrinting BinarySearch result");
		System.out.println("Arrays.binarySearch(arr1,50) : "+Arrays.binarySearch(arr1, 50));

	}
	
	public static void print(int[] arr1, int n) {
		if (n==0) {
			System.out.println("Array is empty");
		} else {
			for (int i=0; i<n; i++) {
				System.out.println("arr1["+i+"] = "+arr1[i]);
			}
			
		}
	}

}
