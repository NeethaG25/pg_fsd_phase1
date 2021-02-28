package sorting_demos;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int ar[]= {12, 14,1, 2, 9, 19,18, 3,6,8};
		System.out.println("Before Sort : "+Arrays.toString(ar));
		sort(ar);
		System.out.println("After Sort : "+Arrays.toString(ar));

	}

	public static void sort(int ar[]) {
		for(int i=0; i< ar.length; i++) {
			for(int j=0; j<ar.length-i-1; j++) {
				if(ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}

}
