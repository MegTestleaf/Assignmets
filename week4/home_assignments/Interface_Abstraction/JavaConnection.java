package week4.home_assignments.Interface_Abstraction;

public class JavaConnection extends MySqlConnection{

	@Override
	public void connect() {
		System.out.println("connect method implemented here which is declared in interface of parent class");		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect method implemented here which is declared in interface of parent class");
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate method implemented here which is declared in interface of parent class");
	}
	
	public static void main(String[] args) {
		JavaConnection obj = new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		obj.executeQuery();
		//MySqlConnection obj1 = new MySqlConnection(); -> not possible as it is abstract class
	}
}
