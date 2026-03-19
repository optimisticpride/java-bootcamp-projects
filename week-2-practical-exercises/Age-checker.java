// Online Java - IDE, Code Editor, Compiler

// Online Java is a quick and easy tool that helps you to build, compile, test your programs online.

// Write your Java code here
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter your Age: ");
    int age = input.nextInt();
    
    if (age >= 0 && age <= 12) {
        System.out.println("Child");
    } else if (age >= 13 && age <= 19) {
        System.out.println("Teen");   
    } else if (age >=21) {
        System.out.println("Adult");   
    }
        }
    }
 

