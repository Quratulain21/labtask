import java.util.Scanner;

public class task4
{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your marks for Matriculation, Intermediate and Test result:");
    int m = input.nextInt();
    int i = input.nextInt();
    int t = input.nextInt();

    if (m >= 85 && i >= 85 && t >= 85) {
      System.out.println("Your CPN is A");
    }
    else if (m >= 80 && i >= 80 && t >= 80) {
      System.out.println("Your CPN is A");
    }
    else if (m >= 75 && i >= 75 && t >= 75) {
      System.out.println("Your CPN is B+");
    }
    else if (m >= 60 && i >= 60 && t >= 60) {
      System.out.println("Your CPN is B");
    }
    else if (m >= 50 && i >= 50 && t >= 50) {
      System.out.println("Your CPN is C");
    }
    else {
      System.out.println("You have failed.");
    }
  }
}