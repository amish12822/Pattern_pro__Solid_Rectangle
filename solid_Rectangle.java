/**
 * solid_Rectangle
 */
public class solid_Rectangle {

    public static void main(String[] args) {
        int a = 4; // row
        int b = 5; // column

        for (int i=1; i<=a; i++){

            for (int j=1; j<=b; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}