package labwork7;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Size : ");
        int n=scan.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("  ");
            }
            
            for(int j=i;j<n;j++)
            {
                System.out.print("$ ");
            }
            
            System.out.println();
        }
        
    }
    
}
