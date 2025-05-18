// INFO: Please Uncomment the codes to run them.
// Advance Programmingin Java, A college lab report.




// INFO: Basic arithmetic:


// import java.util.Scanner;
//
// class mainClass{
//
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//
//     System.out.println("Enter two numbers:");
//     int a = scanner.nextInt();
//     int b = scanner.nextInt();
//
//     System.out.println("The sum of "+ a +" and "+ b +" is "+ (a+b));
//     System.out.println("The subtraction of "+ a +" and "+ b +" is "+ (a-b));
//
//     if (a!=0 && b!=0)
//     {
//       System.out.println("The Multiplicaiton of "+ a +" and "+ b +" is "+ (float)a*b);
//     }
//     else {
//       System.out.println("The Multiplicaiton of two numbers is 0.");
//     }
//
//     if (a!=0) {
//       System.out.println("The division of "+ b +" and "+ a +" is "+ (float)b/a);
//     } else {
//       System.out.println("One or both of the give numbers are zero.");
//     }
//
//
//     scanner.close();
//   }
// }

// INFO: Even Odd check


// import java.util.Scanner;
//
// class mainClass{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//
//     System.out.print("Enter a number: ");
//     int num = sc.nextInt();
//
//     if (num % 2 == 0) {
//       System.out.println("Even");
//     } else {
//       System.out.println("Odd");
//     }
//
//     sc.close();
//   }
// }



//INFO: Simple Fibonacci sequence

// import java.util.Scanner;
//
// public class Fibonacci {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//
//     System.out.print("Enter the number of terms: ");
//     int n = sc.nextInt();
//
//     if (n <= 0) {
//       System.out.println("Please enter a positive number.");
//     } else if (n == 1) {
//       System.out.println("Fibonacci sequence: 0");
//     } else {
//       int a = 0, b = 1, c;
//       System.out.print("Fibonacci sequence: " + a + " " + b);
//       for (int i = 2; i < n; i++) {
//         c = a + b;
//         System.out.print(" " + c);
//         a = b;
//         b = c;
//       }
//       System.out.println();
//     }
//
//     sc.close();
//   }
// }

//INFO: Reverse String 


// import java.util.Scanner;
//
// public class ReverseString {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//
//     System.out.print("Enter a string: ");
//     String str = sc.nextLine();
//
//     String reversed = new StringBuilder(str).reverse().toString();
//     System.out.println("Reversed: " + reversed);
//
//     sc.close();
//   }
// }
