package week4.home_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Second_Largest_Number_List {

	public static void main(String[] args) {
		List<Integer> input_list = new ArrayList<Integer>();
		int [] input = {3, 2, 11, 4, 6, 7};
		for(int i=0;i<input.length;i++)
			input_list.add(input[i]);
		Collections.sort(input_list);
		System.out.println("Sorted list: " +input_list);
		System.out.println("Second largest number is " +input_list.get(input_list.size()-2));
		
	}
}
