package students1;

public class Students {
public void getStudentInfo(int id) {
	System.out.println(id);
}
public void getStudentInfo(String name) {
	System.out.println(name);
}
public void getStudentInfo(int id,String email) {
	System.out.println(id+"  "+email);
}	
	public void getStudentInfo(int phoneNumber,String name,String email) {
		System.out.println(phoneNumber+"  "+name+"  "+email);
	}
	public static void main(String[] args) {
		Students std=new Students();
		std.getStudentInfo(1);
		std.getStudentInfo("Nila");
		std.getStudentInfo(1, "nila05@gmail.com");
		std.getStudentInfo(765930757, "Nila","nila05@gmail.com" );
		std.getStudentInfo(2);
		std.getStudentInfo("Meena");
		std.getStudentInfo(2, "meena455@gmail.com");
		std.getStudentInfo(965130756, "Meena","meena455@gmail.com" );
	}}