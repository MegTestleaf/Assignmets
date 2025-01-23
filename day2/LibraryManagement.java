package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		System.out.println("Inside different class");
		Library L2 = new Library();
		System.out.println(L2.addBook("Shadowhunters"));
		L2.issueBook();

	}

}
