package Task_5;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of Floyd's Triangle: ");
        int n = scan.nextInt();

        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k % 2 + " ");
                k++;
            }
            System.out.println();
        }
    }

}
