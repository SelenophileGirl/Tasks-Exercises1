package Assignment1;

public class Person {
    /**Person class instance variable*/
    private String name;

    /**a default constructor with no aguments*/
    public Person(){
        /*modifying and removing the print statement
        System.out.println("Constructor Running!");
         */
    }
    /**a constructor with a single argument, name*/
    public Person(String name){
       /*modifying and removing the print statement
        System.out.println(name);
         */
        this.name = name;
    }

    /**a method writeName, to print the name of a Perosn*/
    public void writeName(){
        System.out.println("My name is " + this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

