package sorting_demos;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int ar[]= {12, 14,1, 2, 9, 19,18, 3,6,8};
		System.out.println("Before Sort : "+Arrays.toString(ar));
		sort(ar);
		System.out.println("After Sort : "+Arrays.toString(ar));

	}
	
	public static void sort(int ar[]) {
		for(int i=0; i<ar.length; i++) {
			int min=i;
			for (int j=i+1; j<ar.length; j++) {
				if(ar[j]<ar[min]) {
					min=j;
				}
			}
			int temp=ar[min];
			ar[min]=ar[i];
			ar[i]=temp;
			
		}
	}

}
