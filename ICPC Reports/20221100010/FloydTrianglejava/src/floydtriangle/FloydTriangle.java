/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floydtriangle;

/**
 *
 * @author nahid
 */
public class FloydTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 13, number = 1;
for (int i = 1; i <= rows; i++) {
for (int j = 1; j <= i; j++) {
System.out.print(number + " ");
number++;
}
System.out.println();
}
}
}
