package week4.home_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Intersection_List {

	public static void main(String[] args) {
		int[] array1 = {3, 2, 11, 4, 6, 7};
		int[] array2 = {1, 2, 8, 4, 9, 7};
		List<Integer> combined_list = new ArrayList<Integer>();
		for(int i=0;i<array1.length;i++) {
			combined_list.add(array1[i]);
		}
		for(int i=0;i<array2.length;i++) {
			combined_list.add(array2[i]);
		}
		Collections.sort(combined_list);
		System.out.println(combined_list);
		for(int i=0;i<combined_list.size()-2;i++) {
			if(combined_list.get(i)==combined_list.get(i+1))
				System.out.println(combined_list.get(i));
		}
	}
}
