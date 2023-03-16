package Stackds;

import java.util.Scanner;


public class Stackds 
{
	static int top=-1,cap=5, Stackds[] = new int [cap];
	public static void push(int ele) 
	{
		if(top==cap-1) {
			System.out.println("stack is full");
		}
		else
		{
			top++;
			 Stackds[top]=ele;
			 System.out.println(ele+"  Element added into stack");
		}
	}
	
	public static void pop()
	{
		if(top==-1) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println(Stackds[top]+"  Top element deleted from stack");
			top--;
			
		}
	}
	
	public static void peek() 
	{
		if(top==-1) {
			System.out.println("stack is empty");
		}else {
		System.out.println(Stackds[top] +"  peek element in stack");
		}
	}
	
	public static void display() {
		if(top==-1) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println("--------------------------------------------------------------");
			System.out.println("Displaying stack elements ");
			System.out.println("--------------------------------------------------------------");
			for(int i=top;i>=0;i--) {
				System.out.println(Stackds[i]);
			}
		}
	}
	
	public static boolean isfull() {
		if(top==cap-1) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isEmpty() {
		if(top!=-1) {
			return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		while(true) 
		{
		 System.out.println("--------------------------------------------------------------");
		 System.out.println("Enter 1 for adding elements into stack");
		 System.out.println("Enter 2 for deleting elements into stack");
		 System.out.println("Enter 3 to display top most  element in stack");
		 System.out.println("Enter 4 to display all the elements in stack");
		 System.out.println("Enter 5 to know stack full or not ");
		 System.out.println("Enter 6 to know stack is empty or not");
		 System.out.println("Enter 7 to exit ");
		 System.out.println("--------------------------------------------------------------");
		 
		switch(sc.nextInt()) 
		{
		case 1:
			System.out.println("Enter an interger number");
			push(sc.nextInt());
			break;
		case 2:
			pop();
		    break;
		case 3:
			peek();
			break;
			
		case 4:
			display();
			break;
		case 5:
			System.out.println(isfull());
			break;
		case 7:
			System.out.println("Thank you.......!");
			 System.exit(0);
			break;
		case 6 :
			System.out.println(isEmpty());
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		} 
	}
}
