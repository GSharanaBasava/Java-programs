package program_logic_hard1;

public class Hard1_string {
	 
	static String check(String str,int a,char c) {
		return str.substring(0,a)+c+str.substring(a); 		// including adding value  output = abzcd
	
	}
	static String check2(String str,int a,char c) {
		return 	str.substring(0,a)+c+str.substring(a+1);		// excluding original value and re-initilize with new one  output = abcd
	}
	public static void main(String[] args) {
		int a=2;char c='z';String str="abcd";
		System.out.println(check(str,a,c));
		System.out.println(check2(str,a,c));
		 
		
	}
}
