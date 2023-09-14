import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    boolean loggedIn = false; //creating a boolean and printing it
    String key = "s12345";
   
    System.out.println("Hello! what is your name?");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    System.out.println("Hello " + name + "\n" + "what is your password?");
    String password = scan.nextLine();
    while (loggedIn==false) {
      if (password instanceof String) {
      System.out.println("true");
      }
      if (password.equals(key)) {
        System.out.println("logged in!");
        loggedIn = true;
      } else {
        System.out.println("wrong password!");
        password = scan.nextLine();
      }
    }
    scan.close();
   
    int integer; //creating an int and printing it out
    integer = 10;
    System.out.println("integer: " + integer);
   
    double decimal = 0.5; //creating a double and printint it
    System.out.println("double: " + decimal);
   
    final double PI = 3.14; //creating a constant
    System.out.println("Pi: " + PI);
  }
}