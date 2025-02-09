package week3.day1;

public class String_type {

	public static void main(java.lang.String[] args) {
		String companyName= "TestLeaf";
		char text[]=companyName.toCharArray();
		for(int i=text.length-1;i>=0;i--) {
			System.out.print(text[i]);
		}
	}

}
