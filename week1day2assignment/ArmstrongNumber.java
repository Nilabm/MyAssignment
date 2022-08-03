package week1day2assignment;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number=153;
		int r=0,sum=0;
		int num=number;
		while(num>0) {
			r=num%10;
			num=num/10;
			sum=sum+(r*r*r);
			
		}
		if(sum==number) {
			System.out.println("Armstrong number:"+number);
		}
		else
			System.out.println("not Armstrong number:"+number);

}
	
}	

