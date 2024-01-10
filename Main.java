class Person11 {
 // Attributes of the Person class
 String name;
 int age;

 // Constructor for the Person class
 public Person11(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to display information about the person
 public void displayPersonInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Employee class (subclass of Person)
class Employee extends Person11 {
 // Additional attributes for the Employee class
 int employeeID;
 double salary;

 // Constructor for the Employee class
 public Employee(String name, int age, int employeeID, double salary) {
     // Using 'super' to call the constructor of the base class (Person)
     super(name, age);

     // Initializing attributes specific to the Employee class
     this.employeeID = employeeID;
     this.salary = salary;
 }

 // Method to display information about the employee
 public void displayEmployeeInfo() {
     // Using 'super' to call the method of the base class (Person)
     super.displayPersonInfo();
     System.out.println("Employee ID: " + employeeID);
     System.out.println("Salary: $" + salary);
 }
}

//Example usage of the Person and Employee classes
public class Main {
	
	
 public static void main(String[] args) {
     // Creating an instance of the Employee class
     Employee employee1 = new Employee("John Doe", 30, 101, 50000.0);

     // Displaying information about the employee
     employee1.displayEmployeeInfo();
 }
}
