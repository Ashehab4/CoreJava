package oop;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Employee E1 = new Employee();
//        
//        E1.Name = "Mike";
//        E1.EmpId = 1000;
//        E1.Department = "HR";
//        E1.Display();
//        
//        Employee E2 = new Employee("Jack", 1001, "Finance");
//        E2.Display();
		Bank b = new Bank();
		b.DisplayBalance();
		System.out.println("Your balance is "+b.getBalance());

	}

}
