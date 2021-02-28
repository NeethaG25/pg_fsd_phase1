package sorting_demos;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int ar[]= {12, 14,1, 2, 9, 19,18, 3,6,8};
		System.out.println("Before Sort : "+Arrays.toString(ar));
		sort(ar, 0, ar.length-1);
		System.out.println("After Sort : "+Arrays.toString(ar));

	}
	
	public static void sort(int ar[], int l, int r) {
		if(l<r) {
			int mid=(l+r)/2;
			sort(ar, l, mid);
			sort(ar, mid+1, r);
			merge(ar, l, mid,r);
		}
		
	}
	
	public static void merge(int[] ar, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int temp1[]=new int[n1];
		int temp2[]=new int[n2];
		
		for(int i=0; i<temp1.length; i++) {
			temp1[i]=ar[l+1];
		}
		for(int i=0; i<temp1.length; i++) {
			temp2[i]=ar[m+1+i];
		}
		
		int i=0, j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(temp1[i]<=temp2[j]) {
				ar[k]=temp1[i];
				i++;
			}else {
				ar[k]=temp2[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			ar[k]=temp1[i];
			i++;
			k++;
		}
		while(j<n2) {
			ar[k]=temp2[j];
			j++;
			k++;
		}
	}

}
