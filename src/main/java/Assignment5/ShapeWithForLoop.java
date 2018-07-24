package Assignment5;

/**a program that draws two triangle of 8's using for loop
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
public class ShapeWithForLoop {

    public static void main(String[] args) {

        //drawing the full triangle
        for(int i = 1 ; i <= 11 ; i++){
            for(int j = 1 ; j <= i; j++){

                System.out.print(8);
            }
            System.out.println();
        }

        //drawing the triangle without the lines having an even number of 8's
        for(int i = 1 ; i <= 11 ; i++){
            for(int j = 1 ; j <= i; j++){

                if(!(i % 2 == 0))
                    System.out.print(8);
            }
            System.out.println();
        }
    }

}

