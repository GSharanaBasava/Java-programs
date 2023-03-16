package Stackds;

public class Stringrev {
	static int top=-1;
	static int cap;

	static char StackDS [] =new char[7];

	public static void push(char ele) {
		if(top==cap-1) {
			System.out.println("stack is full");
		}
		top++;
		StackDS[top]=ele;
	}
	public static char pop() {

		return StackDS[top--];

	}
	public static void main(String[] args) {
		String str="sharana";
		String rev="";
		cap=str.length();
		StackDS=new char[cap];
		for(int i=0;i<cap;i++) {
			push(str.charAt(i));
		}

		while(top!=-1) {
			rev=rev+pop();
			
		}
		System.out.println(rev);

	}

}
