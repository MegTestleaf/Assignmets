package week3.home_assignments;
public class Change_Odd_Index_To_Uppercase {

	public static void main(String[] args) {
		String test = "changeme";
		String x = "";
		//char[] t1 = test.toCharArray();
		for(int i=0; i<test.length();i++) {
			if(i%2==1) {
				char ch = test.charAt(i);
			      if (Character.isLowerCase(ch))
			        x += Character.toUpperCase(ch);
			      else
			        x += test.charAt(i);
			    }
			else {x += test.charAt(i);}
			}System.out.println(x);
		}
	}