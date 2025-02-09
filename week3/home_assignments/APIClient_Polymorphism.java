package week3.home_assignments;

public class APIClient_Polymorphism {
	
	public void sendRequest(String endpoint) {
		System.out.println("Enpoint is " + endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Enpoint is " + endpoint + "with request body as "+ requestBody + " requestStatus as " + requestStatus);
	}
		
	public static void main(String[] args) {
		APIClient_Polymorphism obj = new APIClient_Polymorphism();
		obj.sendRequest("Testleaf.com");
		obj.sendRequest("testleaf.com", "open assignment tab", true);

	}

}
