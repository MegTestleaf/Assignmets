package week3.home_assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int a []= {1,4,3,8, 6, 7,20};
		Arrays.sort(a);
		int array_size = a.length;
		int smallest_number = a[0];
		int largest_number = a[array_size-1];
		for(int i = smallest_number;i<largest_number;i++) {
			boolean present = false;
			for(int j=0;j<array_size-1;j++) {
				if(a[j]==i)
					{
					present = true;
					break;
					}
			}
			if(!present)
				System.out.println(i);
	}}
}
