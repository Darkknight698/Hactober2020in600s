import java.util.Scanner;
public class FactorialRecursion {
      public static void main(String[] args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.print("ENTER THE NUMBER TO FIND THE FACTORIAL :");
          int num = sc.nextInt();
          int fact = factorial(num);
          System.out.println("FACTORIAL OF " + num + " IS :" + fact);
      }

      public static int factorial(int num)
      {
          int fact = 1;
          if(num >= 1)
              return num * factorial(num-1);

          else
              return 1;
      }
}
