package Assignment1;

/**Main class to test Perosn class and it's methods*/
public class Main {

    public static void main(String[] args) {

        // creating a new object from class Person
        Person me = new Person();

        //set and get the name variable
        me.setName("Eman");
        System.out.println(me.getName());

        //printing the name of the me object
        me.writeName();


    }
}
