package Exception_Handling;
class Demo {
	public    void test() {
		System.out.println("hi");
	}
}

public class Expception_Handling {

	public static void main(String[] args) {
		int [] ar=new int [3];
		int a=0;
		int b=10;
		int sum=0;
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		Demo d1=new Demo();
		d1=null;
		try { 
			ar[3]=40; 
			  
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handle in arrayoutofbounds");
		}
		
		try {
			  
			d1.test();
		}
		catch(NullPointerException e) {
			System.out.println("handel in null");

		}
		
		try {
			sum=b/a; 
 		}
		catch(ArithmeticException e) {
			System.out.println("handel in arthematic exp");
		}
		
		catch(Exception e) {
			System.out.println("handel in exp");

		}
		 
       for(int i=0;i<ar.length;i++) {
    	   System.out.println(ar[i]);
       }
       System.out.println(sum);
	}

}
