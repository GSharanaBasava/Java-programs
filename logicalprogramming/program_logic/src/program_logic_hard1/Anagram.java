package program_logic_hard1;

public class Anagram {
	static String check(String s,String res) {
		int c=s.length();
		for(int i=0;i<res.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				res = res.toLowerCase();			// ignoring case 
				if(res.charAt(i)==s.charAt(j)) 
				{ 
					count++;
					c--;
					break;
				}
			}
			if(count==0) {
				return "No"; 
			}
		}
		System.out.println("the missing characters are : "+c);
		 return "yes";
	}
	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyz"; 
		String res="abD";
		System.out.println(check(str,res));
	}

}
