package week3.home_assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="Test";
		String text2 = "STTE";
		if(text1.length()!=text2.length()) {
			System.out.println("Not anagram, mismatch in length");
		}else {
		text1 = text1.toLowerCase();
		text2 = text2.toLowerCase();
		char t1[] = text1.toCharArray();
		char t2[] = text2.toCharArray();
		Arrays.sort(t1);
		Arrays.sort(t2);
		boolean param = false;
		for(int i=0;i<text1.length();i++) {
			if(t1[i]!=t2[i]) {
				System.out.println("Not anagrams");
				param = true;
				break;
			}
		}
		if(!param) {System.out.println("Give texts are anagram");}
		}
	}
}
