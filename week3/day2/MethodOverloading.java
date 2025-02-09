package week3.day2;

public class MethodOverloading {

	public void reportStep(String msg, String status) {
		System.out.println("Inside 2 argument repotStep method with message "+msg+" and status "+status);
	};
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("Inside 3 argument repotStep method with message "+msg+" and status "+status+" and snap status "+snap);
	};
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.reportStep("Good morn", "cloudy");
		mo.reportStep("Good aft", "sunny", false);
	}

}
