package epam.practice;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
//		int[] arrays = {10, 7, 9, 6};	
//		int a = 0;
//		int b = 0;
//		for (int array : arrays) {
//			a = a ^ array;
//		}
//		for (int i = 1; i <= arrays.length + 1; i++) {
//			b = b ^ i;
//		}
//		System.out.println(a^b);
		
//      int[] arrays = { 10, 2, 3, 4, 5, 7, 8, 9, 1 };
//		int[] arrays = {10, 7, 9, 6};
//		int n = arrays.length + 1;
//		int totalSum = n*(n+1)/2;
//		int sum = 0;
//		for (int i : arrays) {
//			sum = sum + i;
//		}
//		
//		System.out.println(totalSum - sum);
//		
//		int[] arr = {10, 2, 8, 1, 9};
//		
//		Arrays.sort(arr);
//		
//		int[] b = new int[arr[arr.length - 1] + 1];
//		
//		for (int i = 0; i < arr.length; i++) {
//			b[arr[i]] = 1;
//		}
//		
//		for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
//			if(b[i] == 0) {
//				System.out.print(i + " ");
//			}
//		}
		
		int[] arr = {10, 2, 8, 1, 9};
		Arrays.sort(arr);
		int count = 0;
		for(int i = arr[0]; i<=arr[arr.length - 1]; i++) {
			if(arr[count] == i) {
				count++;
			} else {
				System.out.print(i+ ", ");
			}
		}
		
	}

}
