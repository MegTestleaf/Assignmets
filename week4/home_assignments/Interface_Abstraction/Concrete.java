package week4.home_assignments.Interface_Abstraction;

public class Concrete implements DatabaseConnection{

	@Override
	public void connect() {
		System.out.println("Connect method");		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect method");		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate method");
	}
	
	public static void main(String[] args) {
		Concrete obj = new Concrete();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
	}
}
