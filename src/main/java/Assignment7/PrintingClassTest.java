package Assignment7;

/**a testing class for PrintingClass*/
public class PrintingClassTest {

    public static void main(String[] args) {

        //creating an object from class PrintingClass
        PrintingClass obj1 = new PrintingClass();

        //testing all four methods of obj1
        obj1.print(5);
        obj1.print("Peace");
        obj1.print(8 , 4);
        obj1.print(8 , 4 , 3);
    }
}
