package week4.home_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_List {

	public static void main(String[] args) {
		String[] input =  {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> input_list = new ArrayList<String>();
	
		for(int i=0;i<input.length;i++) {
			input_list.add(input[i]);
		}
		Collections.sort(input_list);
		System.out.println("Asc list: "+input_list);
		
		List<String> reverse_list = new ArrayList<String>();
		System.out.println("Reverse list: ");
		for(int i=input_list.size()-1;i>=0;i--) {
			reverse_list.add(input_list.get(i));
		}
		System.out.print(reverse_list);
	}
}
