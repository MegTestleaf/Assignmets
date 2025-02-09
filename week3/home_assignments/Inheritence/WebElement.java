package week3.home_assignments.Inheritence;

public class WebElement {
	//Create a base class named WebElement with common methods such as click() and setText(String text)
	public void click() {
		System.out.println("In click method from super class");
	}
	public void setText(String text) {
		System.out.println("In setText method from super class, and the text is " + text);
	}
}
