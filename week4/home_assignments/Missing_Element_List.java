package week4.home_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Missing_Element_List {

	public static void main(String[] args) {
		List<Integer> input_list = new ArrayList<Integer>();
		int [] input = {1, 4, 10, 6, 8};
		for(int i=0;i<input.length;i++)
			input_list.add(input[i]);
		Collections.sort(input_list);
		System.out.println("Sorted list: " +input_list);
		for(int i=input_list.get(0);i<input_list.get(input_list.size()-1);i++)
		{
			boolean present = false;
			for(int j=0;j<input_list.size()-1;j++)
			{
				if (input_list.get(j)==i)
					present = true;
			}
			if(!present)
				System.out.println(i);
		}
	}

}
