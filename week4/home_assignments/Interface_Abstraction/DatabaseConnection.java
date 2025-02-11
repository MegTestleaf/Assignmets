package week4.home_assignments.Interface_Abstraction;

public interface DatabaseConnection {
	public void connect();
	public void disconnect();
	public void executeUpdate();
}
