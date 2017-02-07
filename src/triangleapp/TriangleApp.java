package triangleapp;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rihards
 */
public class TriangleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[3];

        System.out.println("Insert three triangle values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

         if (values[0] == values[1] && values[1] == values[2]) {
            System.out.println("Triangle is equilateral");
        } else if (values[0] == values[1] && values[0] != values[2] || 
                values[1] == values[2] || values[0] == values[2] ) {
            System.out.println("Triangle is isosceles");
       } else {
            System.out.println("Triangle is scalene");
        }
    }
}
