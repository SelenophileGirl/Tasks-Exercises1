package Assignment2;

public class Employee {

    /**Employee class instance variables*/
    private String firstName;
    private String lastName;
    private double salary;

    /**a constructor with three arguments*/
    public Employee(String firstName , String lastName , double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    /**setSalary method sets the salary of an employee to 0.0 if the salary passed is negative*/
    public void setSalary(double salary) {
        if(salary < 0){
            this.salary = 0.0;
        }else{
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }


}
