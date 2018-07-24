package Assignment6;

import java.util.Scanner;
/**a program that implements entering two operands and an operator and calculate the result*/
public class Calculating {

    public static void main(String[] args) {

        int firstOperand, secondOperand;
        String operator;
        int result = 0;
        boolean firstTime = true;

        Scanner in = new Scanner(System.in);


        //entering two numbers and an operator
        System.out.println("Enter First Number");
        firstOperand = in.nextInt();
        System.out.println("Enter Second Number");
        secondOperand = in.nextInt();
        System.out.println("Enter an Operator");
        operator = in.next();

        //checking if the entered operator is correct, and ask to re-enter a new one if not
            while (!("/*-+".contains(operator))) {
                if(operator.equals("Z")  && !firstTime){
                    System.out.println("Program Exited");
                    return;
                }else {
                    System.out.println("Please enter a correct operator! or enter Z to exit!");
                    operator = in.next();
                }
                firstTime = false;
            }
            // removed to be implemented using switch
           /* if (operator.equals("+"))
                result = (firstOperand + secondOperand);
            else if (operator.equals("-"))
                result = (firstOperand - secondOperand);
            else if (operator.equals("*"))
                result = (firstOperand * secondOperand);
            else if (operator.equals("/"))
                result = (firstOperand / secondOperand);
            else if (operator.equals("%"))
                result = (firstOperand % secondOperand);
            */

           switch(operator.charAt(0)){
               case '+':
                   result = (firstOperand + secondOperand);
                   break;
               case '-':
                   result = (firstOperand - secondOperand);
                   break;
               case '*':
                   result = (firstOperand * secondOperand);
                   break;
               case '/':
                   result = (firstOperand / secondOperand);
                   break;
               case '%':
                   result = (firstOperand % secondOperand);
                   break;

           }
        System.out.println(firstOperand + " " + operator + " " + secondOperand + " = " + result);
    }
}
