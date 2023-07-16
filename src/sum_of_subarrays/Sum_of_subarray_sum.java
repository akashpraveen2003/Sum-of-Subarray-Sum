package sum_of_subarrays;

import java.util.Scanner;
/*
 * You are given an integer array A of length N.
	You have to find the sum of all subarray sums of A.

PS: A subarray sum denotes the sum of all the elements of that subarray.
 */
public class Sum_of_subarray_sum {
	
	private static int sum_of_all_subarray_sum(int[] array) {
		
		int sum=0;
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			temp=0;
			for(int j=i;j<array.length;j++)		
			{
				temp+=array[j];
				sum+=temp;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int array_size=scanner.nextInt();
		int array[]=new int[array_size];
		for(int i=0;i<array_size;i++)
		{
			array[i]=scanner.nextInt();
		}
		System.out.println(sum_of_all_subarray_sum(array));

	}
}
/*
 	Input
		A = [1, 2, 3]

	Output
		20
		
	Input
		A = [2, 1, 3]

	Output
		19
*/