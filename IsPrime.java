package week1.day1;

public class IsPrime {
public static void main(String[] args) {
	int num = 24, isprime = 0;
	for (int i = 2; i < num-1; i++) {
		if (num%i==0) {
			isprime=1;
			break;
		}
	}
	if(isprime==1) {System.out.println("not prime");}
	else {System.out.println("prime");}
}
}
