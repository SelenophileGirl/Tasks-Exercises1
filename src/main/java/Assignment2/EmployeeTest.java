package Assignment2;

/**EmployeeTest class to test Employee class and it's methods*/
public class EmployeeTest {

    public static void main(String[] args) {

        // creating two new objects from class Employee using three arguments constructor
        Employee firstEmployee = new Employee("Eman" , "Tehabsem", 150);
        Employee secondEmploye = new Employee("Sami" , "Yousef" , 1000);

        //printing the yearly salary for firstEmployee and secondEmployee
        System.out.println("firstEmployee Salary: " + firstEmployee.getSalary() * 12);
        System.out.println("secondEmployee Salary: " + secondEmploye.getSalary() * 12);

        //adding 10% raise for both employees
        firstEmployee.setSalary(firstEmployee.getSalary() + firstEmployee.getSalary() * 0.10);
        secondEmploye.setSalary(secondEmploye.getSalary() + secondEmploye.getSalary() * 0.10);

        //printing the new yearly salary for firstEmployee and secondEmployee
        System.out.println("firstEmployee Salary: " + firstEmployee.getSalary() * 12);
        System.out.println("secondEmployee Salary: " + secondEmploye.getSalary() * 12);

    }
}
