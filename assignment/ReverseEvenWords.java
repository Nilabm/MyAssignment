package week2.day4.assignment;



public class ReverseEvenWords {
public static void main(String[] args) {
	String test="I am a software tester";
	char[] charArray=test.toCharArray();
	for (int i = charArray.length-1;i>=0; i--) {
		System.out.println(charArray[i]);
	}
		
	
}
}
