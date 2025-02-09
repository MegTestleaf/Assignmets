package week3.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		int[] array = {67,45,23,90,100,455,23,62,45,1000,90,67,0,1,0};
		Arrays.sort(array); //sorting helps in using single for loop for comparison
		for(int i=0; i<array.length-1; i++) {
			if(array[i]==array[i+1]) //same numbers will be nearer
			{
				System.out.println(array[i]);
			}
		}
	}
}
