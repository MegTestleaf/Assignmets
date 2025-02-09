package week3.day2;

public class Safari extends Browser{
	public void readerMode() {
		System.out.println("Inside readerMode method of Safari class");
	}
	public void fullScreenMode() {
		System.out.println("Inside fullScreenMode method of Safari class");
	}
	
	public static void main(String[] args) {
		Safari sf = new Safari();
		sf.browserName = "Safari";
		sf.version = 91.0f;
		sf.readerMode();
		sf.fullScreenMode();
		System.out.println(sf.browserName);
		System.out.println(sf.version);
	}
}
