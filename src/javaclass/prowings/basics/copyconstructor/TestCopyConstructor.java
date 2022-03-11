package javaclass.prowings.basics.copyconstructor;

public class TestCopyConstructor {
public static void main(String[] args) {
	Address add = new Address("Pune","India",416211);
	Employee emp1 = new Employee(142, "Raj",add);
	System.out.println("Emp 1 ="+emp1);
	Employee emp2 = new Employee(emp1);
	System.out.println("Emp 2 ="+emp2);
	emp1.address.city = "Kolhapur";
	emp2.address.pin = 411029;
	System.out.println("Changed Emp1 = "+emp1);
	System.out.println("Changed Emp2 = "+emp2 );       
}
}
            