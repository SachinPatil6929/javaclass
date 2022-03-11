package javaclass.prowings.basics.overloading;

public class OverloadingDemo {
	
	public static void testMethod(int num) {
		System.out.println("number "+num);	
	}
	public static void testMethod(String str) {
		System.out.println("String "+str);
	}
	public static void testMethod(int num, String str) {
		System.out.println("Number & String "+num +str);
	}
	
	public static void main(String[] args) {
		testMethod(10);
		testMethod("Sachin");
		testMethod(10, "Sachin");
	}
}
