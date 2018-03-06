package logic;

public class Palindrome {
	public static String reverse(String input) {
		StringBuffer in = new StringBuffer(input);
		in.reverse();
		return in.toString();
	}
	public static Boolean checkPalindrome(String input) {
		String check = reverse(input);
		if(check==input) {
			return true;
		}
		else return false;
	}
	public static String makePalindrome(int length) {
		StringBuffer storage = new StringBuffer();
		for(int i=0;i<Math.ceil(length/2);i++) {
			storage.append((char)Math.floor(Math.random()*0x41));
		}
		storage.append(reverse(storage.toString()));
		return storage.toString();
	}
}
