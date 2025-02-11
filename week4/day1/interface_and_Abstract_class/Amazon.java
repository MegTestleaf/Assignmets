package week4.day1.interface_and_Abstract_class;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		System.out.println("COD");
	}

	@Override
	public void upiPayments() {
		System.out.println("upiPayments");
	}

	@Override
	public void cardPayments() {
		System.out.println("cardPayments");
	}

	@Override
	public void internetBanking() {
		System.out.println("internetBanking");
	}
	
	//Main method:
	public static void main(String[] args) {
		Amazon am = new Amazon();
		am.cardPayments();
		am.cashOnDelivery();
		am.upiPayments();
		am.internetBanking();
		am.recordPaymentDetails();
	}}
