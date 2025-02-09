package week3.day2;
import week1.day2.*;

public class Edge extends Browser{
		public void takeSnap() {
			System.out.println("Inside takeSnap method of Edge class");
		}
		public void clearCookies() {
			System.out.println("Inside clearCookies method of Edge class");
		}
		
		public static void main(String[] args) {
			Edge ed = new Edge();
			ed.browserName = "Edge";
			ed.version = 00.0f;
			ed.takeSnap();
			ed.clearCookies();
			ed.openURL();
			ed.closeBrowser();
			ed.navigateBack();
			System.out.println(ed.browserName);
			System.out.println(ed.version);
			
			Chrome ch = new Chrome();
			ch.browserName = "Edgedsvsb";
			System.out.println(ch.browserName);
			ch.clearCache();
			
			Library lib = new Library();
			lib.issueBook();
		}
	}
