package pkg03;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num,t,i,rem;
             	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number: ");
                   num=sc.nextInt();
	    t=num;
	    for(i=0;num>0;num/=10)
	    {
	    rem=num%10;
	    i=(i*10)+rem;
	    }
	   if(i==t)
		System.out.println(t+" is a palindrome number ");
                  else
		System.out.println(t+" is not a palindrome number ");
                  
	}
}
    
