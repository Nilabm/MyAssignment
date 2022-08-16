package bank1;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("Deposit");
}
public static void main(String[] args) {
	AxisBank axs=new AxisBank();
	axs.fixed();
	axs.saving();
	axs.deposit();
}
}
