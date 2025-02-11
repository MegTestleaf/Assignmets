package week4.day1.interface_and_Abstract_class;

public abstract class CanaraBank implements Payments{
	public void recordPaymentDetails() {
		System.out.println("recordPaymentDetails method inside Canaraband abstract class");
	}
	static void recordPaymentDetails(String name) {
		System.out.println("from "+name+"(recordPaymentDetails method) inside Canaraband abstract class");
	}
	public static void main(String[] args) {
		System.out.println("from Abstract class");
		//CanaraBank cb = new CanaraBank();
		recordPaymentDetails("Static method");
	}}