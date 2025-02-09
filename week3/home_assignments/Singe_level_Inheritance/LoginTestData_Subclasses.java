package week3.home_assignments.Singe_level_Inheritance;

public class LoginTestData_Subclasses extends TestData_superclass{
	
	public void enterUsername() {
		System.out.println("In child class under enterUsername method");
	}
	
	public void enterPassword() {
		System.out.println("In child class under enterPassword method");
	}
	
	public static void main(String[] args) {
		LoginTestData_Subclasses child = new LoginTestData_Subclasses();
		TestData_superclass parent = new TestData_superclass();
		System.out.println("Parent class methods called using child class object");
		child.enterCredentials();
		child.navigateToHomePage();
		System.out.println("Child class methods called using child class object");
		child.enterPassword();
		child.enterUsername();
		System.out.println("Parent class methods called using parent class object");
		parent.enterCredentials();
		parent.navigateToHomePage();
		//parent.enterUsername() and parent.enterPassword() is not posible as they are child class method
	}
}
