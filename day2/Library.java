package week1.day2;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library L1 = new Library();
		System.out.println(L1.addBook("Shadowhunters"));
		L1.issueBook();
	}

}
