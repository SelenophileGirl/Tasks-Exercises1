package Assignment8;

import java.util.Scanner;

/**a modified test class of the PrintingClass, it gets the input for the methods from the command line*/
public class ModifiedPrintingClassTest {

    public static void main(String[] args) {

        //creating a new object from PrintingClass
        PrintingClass obj = new PrintingClass();

        //checking if the number of arguments is valid, if not print a message and exit
        if(!(args.length >= 1 && args.length <= 3)) {
            System.out.println("Input is Wrong");
            return;
        }

            //calling methods which matches with the arguments passed
           switch(args.length){
               case 1:
                   if(args[0].matches("\\d+"))
                       obj.print(Integer.parseInt(args[0]));
                   else
                       obj.print(args[0]);
                   break;
               case 2:
                   if(args[0].matches("\\d+") && args[1].matches("\\d+"))
                       obj.print(Integer.parseInt(args[0]) , Integer.parseInt(args[1]));
                   else
                       System.out.println("Input is Wrong");
                   break;
               case 3:
                   if(args[0].matches("\\d+") && args[1].matches("\\d+") && args[2].matches("\\d+"))
                       obj.print(Integer.parseInt(args[0]) , Integer.parseInt(args[1]) , Integer.parseInt(args[2]));
                   else
                       System.out.println("Input is Wrong");
                   break;
           }
        }


    }

