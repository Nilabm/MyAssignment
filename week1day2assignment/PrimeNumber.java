package week1day2assignment;

public class PrimeNumber {
public static void main(String[] args) {
	int number=13;
	boolean prime=true;
	for (int i = 2; i < number; i++) {
		if(number%i==0) {
			prime=false;
			break;
		}
		}
	if(prime==true) {
		System.out.println("It is a prime number");
	}
	else {
		System.out.println("It is not a prime number");
	}
}
}
