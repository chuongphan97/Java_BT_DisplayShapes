import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle with width and height. ");
        System.out.println("2. Draw the square triangle with angle. ");
        System.out.println("3. Draw isosceles triangle with height. ");
        System.out.println("4. Exit");

        int check = 0;
        int width, height;
        int angle = 0;

        while (check != 4) {
            System.out.println("Choose number: ");
            check = scanner.nextInt();

            switch (check) {
                case 1:
                    System.out.println("Input width: ");
                    width = scanner.nextInt();

                    System.out.println("Input height: ");
                    height = scanner.nextInt();

                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Angle of square triangle (TopLeft(1), BottomLeft(2), TopRight(3), BottomRight(4)): ");
                    angle = scanner.nextInt();


                    if (angle == 1){
                        System.out.println("Input height: ");
                        height = scanner.nextInt();

                        for (int i = height;i > 0; i--){
                            for (int j = i; j>0; j--){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    } else if (angle == 2){
                        System.out.println("Input height: ");
                        height = scanner.nextInt();

                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < i; j++){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    }       else if (angle == 3) {
                        System.out.println("Input height: ");
                        height = scanner.nextInt();

                        for (int i = 0; i < height; i++) {
                            for (int j=0 ; j < height; j++){
                                if (j > i) System.out.print("* ");
                                else System.out.print("  ");
                            }
                            System.out.println();
                        }
                    }           else if (angle == 4) {
                        System.out.println("Input height: ");
                        height = scanner.nextInt();

                        for (int i = height; i > 0; i--) {
                            for (int j = 0;j < i-1;j++) {
                                System.out.print("  ");
                            }
                            for (int k = 0; k < height - i + 1; k++){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    }

                    break;

                case 3:
                    System.out.println("Input height: ");
                    height = scanner.nextInt();

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print("  ");
                        }
                        for ( int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }




            }

        }





    }
}