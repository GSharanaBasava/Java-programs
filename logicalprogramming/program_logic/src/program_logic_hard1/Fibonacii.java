package program_logic_hard1;

public class Fibonacii {
	
	public static void disp(int n1,int n2) {
		 
		 
		 int a =n1+n2;
		 
		n1=n2;
		n2=a;
		System.out.println(a);
		    
		 disp(n1,n2);
		 
		if(n2==5) {
			 exit();
		}
	}
	private static void exit() {
		 
		
	}
	public static void main(String[] args) {
		System.out.println("Fabinacii series");
		disp(0,1);
	}
}
