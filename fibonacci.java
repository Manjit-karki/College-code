//INFO: Simple Fibonacci sequence



import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of terms: ");
    int n = sc.nextInt();

    if (n <= 0) {
      System.out.println("Please enter a positive number.");
    } else if (n == 1) {
      System.out.println("Fibonacci sequence: 0");
    } else {
      int a = 0, b = 1, c;
      System.out.print("Fibonacci sequence: " + a + " " + b);
      for (int i = 2; i < n; i++) {
        c = a + b;
        System.out.print(" " + c);
        a = b;
        b = c;
      }
      System.out.println();
    }

    sc.close();
  }
}

