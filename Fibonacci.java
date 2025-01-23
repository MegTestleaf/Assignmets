package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range = 8, a = 0, b = 1;
	System.out.println(a +" "+b);
	for(int i=2;i<range;i++) {
		int c=a+b;
		System.out.print(c+" ");
		a=b;b=c;
	}
	}
}
