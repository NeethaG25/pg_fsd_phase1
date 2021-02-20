package arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int arr1[] = {12, 21, 15, 18, 21, 21};
		
		System.out.println("Printing all elements of the Array");
		for(int i=0;i<arr1.length; i++) {
			System.out.println("arr1["+i+"] = "+arr1[i]);
		}
		
		System.out.println("Printing even elements of the Array");
		for(int i=0;i<arr1.length; i++) {
			if(arr1[i]%2==0) {
				System.out.println("arr1["+i+"] = "+arr1[i]);
			}
		}
		
		System.out.println("Printing sum of odd elements of the Array");
		int odd = 0;
		for(int i=0;i<arr1.length; i++) {
			
			if(arr1[i]%2!=0) {
				odd = odd+arr1[i];
			}
			
		}
		System.out.println("Sum of odd elements of array : "+odd);

	}

}
