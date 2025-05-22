// INFO: Basic arithmetic:

import java.util.Scanner;



class mainClass{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter two numbers:");
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println("The sum of "+ a +" and "+ b +" is "+ (a+b));
    System.out.println("The subtraction of "+ a +" and "+ b +" is "+ (a-b));

    if (a!=0 && b!=0)
    {
      System.out.println("The Multiplicaiton of "+ a +" and "+ b +" is "+ (float)a*b);
    }
    else {
      System.out.println("The Multiplicaiton of two numbers is 0.");
    }

    if (a!=0) {
      System.out.println("The division of "+ b +" and "+ a +" is "+ (float)b/a);
    } else {
      System.out.println("One or both of the give numbers are zero.");
    }

    scanner.close();
  }
}
