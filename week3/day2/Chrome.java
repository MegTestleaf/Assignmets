package week3.day2;

public class Chrome extends Browser{
	public void openIncognito() {
		System.out.println("Inside openIncognito method of Chrome class");
	}
	public void clearCache() {
		System.out.println("Inside clearCache method of Chrome class");
	}
	
	public static void main(String[] args) {
		Chrome ch = new Chrome();
		ch.browserName = "Chrome";
		ch.version = 91.0f;
		ch.openIncognito();
		ch.clearCache();
		System.out.println(ch.browserName);
		System.out.println(ch.version);
	}
	
}
