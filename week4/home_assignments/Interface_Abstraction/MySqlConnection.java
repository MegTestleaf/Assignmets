package week4.home_assignments.Interface_Abstraction;

public abstract class MySqlConnection implements DatabaseConnection{
	public void executeQuery() {
		System.out.println("executeQuery method from abstract class");
	}
}
