package Assignment7;


public class PrintingClass {

    /**method prints this is integer followed by the value*/
    public void print(int x){
        System.out.println("This is integer: " + x);
        System.out.println();
    }

    /**method prints this is String followed by the value*/
    public void print(String x){
        System.out.println("this is String: " + x);
        System.out.println();
    }

    /**method writes x repeated y times*/
    public void print(int x , int y){
        for(int i = 0 ; i < y ; i++)
            System.out.print(x + " ");
        System.out.println();
        System.out.println();
    }

    /**method writes x repeated y times on a line, and repeat the line z times*/
    public void print(int x , int y , int z) {
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(x + " ");
            }
            System.out.println();

        }
    }


}
