
package labwork7;
import java.util.Scanner;

public class Labwork7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("$");
            }
            System.out.print("\n");
        }
    }
    
}
