package week3.home_assignments.Inheritence;

public class Elements extends Button{

	public static void main(String[] args) {
		Elements obj = new Elements();
		System.out.println("From GrandParent class:");
		obj.click();
		obj.setText("Tested");
		System.out.println("From Parent class:");
		obj.submit();
	}
}
