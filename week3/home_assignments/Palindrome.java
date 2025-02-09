package week3.home_assignments;

public class Palindrome {

	public static void main(String[] args) {
		//int input_value = 121;
		int input_value = 12345;
		int output_value = 0, input = input_value;
		while(input!=0) {
			output_value += input%10;
			output_value*=10;
			input/=10;
		}
		output_value/=10;
		System.out.println("Input number is: " + input_value);
		System.out.println("Reverse number is: "+ output_value);
	if(input_value==output_value)
	{
		System.out.println("Palindrome");
	}
	else
		System.out.println("Not a palindrome");
}}
