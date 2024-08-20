import java.util.Scanner;

public class Easy_Fibonacci {
    public static void main(String[]args){

        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c,i,N;
        N = sc.nextInt();
        
        System.out.print(a+" "+b);
        for(i=2;i<N;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
        System.out.print("\n");
    }
}
