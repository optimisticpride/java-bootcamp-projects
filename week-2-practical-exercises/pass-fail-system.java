// Online Java - IDE, Code Editor, Compiler

// Online Java is a quick and easy tool that helps you to build, compile, test your programs online.

// Write your Java code here
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter your marks: ");
    int marks = input.nextInt();
    
    if (marks >= 75) {
        System.out.println("Distinction");
    } else if (marks >= 50) {
        System.out.println("Pass");   
    } else {
                System.out.println("Fail");
            }
        }
    }
 

