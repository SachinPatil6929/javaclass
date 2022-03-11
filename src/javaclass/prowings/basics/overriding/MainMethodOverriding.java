package javaclass.prowings.basics.overriding;

 public class MainMethodOverriding {
	public static void main(String[]args) {
		System.out.println("Main method");
	}
	//public static void main(int...str) {
	//System.out.println("String");
	//}
}
 class A extends MainMethodOverriding{
	public static void main(String... args) {
		System.out.println("vararg method");
	}
}