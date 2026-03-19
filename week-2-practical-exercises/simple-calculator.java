// Online Java - IDE, Code Editor, Compiler

// Online Java is a quick and easy tool that helps you to build, compile, test your programs online.

// Write your Java code here
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Insert first number: ");
    double num1 = input.nextDouble();
    
    System.out.print("Insert second number: ");
    double num2 = input.nextDouble();
    
    System.out.println("Addition: " + (num1 + num2));
    System.out.println("Subtraction: " + (num1 - num2));
    System.out.println("Multiplication: " + (num1 * num2));
    System.out.println("Division: " + (num1 / num2));
  }
}
