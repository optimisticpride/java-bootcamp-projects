// Online Java - IDE, Code Editor, Compiler

// Online Java is a quick and easy tool that helps you to build, compile, test your programs online.

// Write your Java code here
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter your name: ");
    String name = input.nextLine();
    
    System.out.print("Please enter your age: ");
    int age = input.nextInt();
    
    input.nextLine(); // consume leftover newline
    System.out.print("Please enter your city: ");
    String city = input.nextLine();
    
    System.out.print("Hello my name is " + name + ". I am " + age + " years old and i live in " + city + ".");
  }
}
