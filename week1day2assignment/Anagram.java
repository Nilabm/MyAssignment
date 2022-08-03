package week1day2assignment;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String text1="stops";
	String text2="potss";
	char [] charArray1=text1.toCharArray();
	char [] charArray2=text2.toCharArray();
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	 if(text1.length()==text2.length()) {
		 System.out.println(Arrays.equals(charArray1,charArray2));
}
}
}