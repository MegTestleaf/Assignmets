package week3.day2.methodoverriding;

public class Child extends Parent{
	public void takeSnap() {
		System.out.println("Childs class's takeSnap method");
		super.takeSnap();
	}
	
	public static void main(String[] args) {
		Child ch=new Child();
		ch.takeSnap();
		ch.reportStep();
	}

}
