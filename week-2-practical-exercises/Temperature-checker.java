// Online Java - IDE, Code Editor, Compiler

// Online Java is a quick and easy tool that helps you to build, compile, test your programs online.

// Write your Java code here
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter temperature: ");
    int temp = input.nextInt();
    
    if (temp > 30) {
        System.out.println("Hot");
    } else if (temp <= 30) {
        System.out.println("Cold");   
    } 
        }
    }
 

