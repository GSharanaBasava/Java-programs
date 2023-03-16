package program_logic_hard1;

public class Recurssion {
	
	public static int disp(int n) {
		if(n==5) 
			return n;
		
		return n*disp(n+1);    //factorial
    	//return n+disp(n+1);   //for addition of n natural number
		 
		 
	}
	public static void main(String[] args) {
		System.out.println(disp(1));
	}
}
