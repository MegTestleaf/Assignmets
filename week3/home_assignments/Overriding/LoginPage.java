package week3.home_assignments.Overriding;

public class LoginPage extends BasePage{
	//Override the performCommonTasks() method in the LoginPage class.
	public void performCommonTasks() {
		System.out.println("In performCommonTasks method from child class");
	}
	
	public static void main(String[] args) {
		//Override the performCommonTasks() method in the LoginPage class.
		LoginPage child = new LoginPage();
		BasePage parent = new BasePage();
		System.out.println("Fom parent:");
		parent.performCommonTasks();
		System.out.println("From child");
		child.performCommonTasks();
	}

}
