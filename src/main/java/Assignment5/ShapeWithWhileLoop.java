package Assignment5;

/**a program that draws two triangle of 8's using while loop
 * 8                         8
 * 88
 * 888                       888
 * 8888
 * 88888           And       88888
 * 888888
 * 8888888                   8888888
 * 88888888
 * 888888888                 888888888
 * 8888888888
 * 88888888888               88888888888
 * */
public class ShapeWithWhileLoop {

    public static void main(String[] args) {

        //drawing the full triangle
        int outerLoopCount = 1;
        while(outerLoopCount <= 11){

            int innerLoopCount = 1;
            while(innerLoopCount <= outerLoopCount){

                System.out.print(8);
                innerLoopCount++;
            }

            System.out.println();
            outerLoopCount++;
        }

        //drawing the triangle without the lines having an even number of 8's
        outerLoopCount = 1;
        while(outerLoopCount <= 11){

            int innerLoopCount = 1;
            while(innerLoopCount <= outerLoopCount){

                if(!(outerLoopCount%2 == 0)) {
                    System.out.print(8);
                }
                innerLoopCount++;
            }

            System.out.println();
            outerLoopCount++;
        }

    }
}
