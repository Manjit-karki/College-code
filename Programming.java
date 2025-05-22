//INFO: Lab work: Abstraction
// simple code

import java.util.Scanner;

abstract class FirstYearCourse {
  abstract void printName();
  abstract void printCode();
  void printTotalWeeks()
  {
    System.out.println("Total weeks in first year 40 weeks");
  }
}


public class Programming extends FirstYearCourse {


  void printName()
  {
    System.out.println("Name");
  }

  void printCode()
  {
    System.out.println("Coding in Java is not fun");
  }

  public static void main(String[] args){
    Programming p = new Programming();
    p.printName();
    p.printCode();
    p.printTotalWeeks();
  }
}
