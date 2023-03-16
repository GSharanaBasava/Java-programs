package Stackds;

import java.util.Scanner;

public class Curlybracers {
	public static int cap,top=-1;
	static char stackds[];

	public static void push(char ele) {
		if(top==cap-1) {
			System.out.println("stack is full");
		}
		else
		{
			top++;

			stackds[top]=ele;
		}
	}

	public static char pop() {
		if(top==-1) {
			System.out.println("stack is empty");
		}

		return stackds[top--];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");

		String cb=sc.nextLine();
		cap=cb.length();
		stackds=new char[cap];
		for(int i=0;i<cb.length();i++) {

			if(cb.charAt(i)=='(' ||  cb.charAt(i)==')'  ){
				System.out.println("not balanced ");
				System.exit(0);
			}
			if(cb.charAt(i)=='(') {
				push(cb.charAt(i));
			}
			else {
				pop();
			}
		}

		if(top==-1) {
			System.out.println("string is balanced");
		}
		else {
			System.out.println("string is not balance");
		}

	}

}
