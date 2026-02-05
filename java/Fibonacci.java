import java.util.Scanner;
public class Fibonacci{
    static int febRecurise(int n){
        if (n == 0)
          return 0;
        if( n == 1)
        return 0;
        return febRecurise(n-1)+ febRecurise(n - 2);
        static void fiblterative(int n)
        {
            int a = 0,b = 1, c;
            System.out.println(a+""+b+"");
            for(int i = 2; i<n;i++){
                c = a+b;
                 System.out.println(c+"");
                 a =b;
                 b =c;
                 public static void mian(String[]args){
                    Scanner sc =new
                    System.out.println("Enter number of terms:");
                    int n = sc.nextInt();
                    System.of.println("\nFibonacci Series using Recursion:");
                    for (int i = 0; i < n;i++)
                {
                    System.out.println(febRecurise(i)+"");

                }
                System.out.println("\n\nFibonacci Series using Non-Recursion:");
                fiblterative(n);
                so.close();
            
                }

            }
        }
    }



    }
}