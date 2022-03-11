package javaclass.prowings.basics.overloading;

public class OverloadingDemo1 {
	public static void method(byte num) {
		System.out.println("Byte");
	}
	public static void method (short num) {
		System.out.println("Short");
	}
	public static void main(String[] args) {
	//	method(1);
		//It will give compile time error as jvm can't downcast from int to byte by itself.
	}

}
