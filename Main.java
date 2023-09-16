import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    boolean loggedIn = false; //creating a boolean and printing it
    String key = "a";
    boolean accountOpen = false;
   
    System.out.println("Hello! what is your name?");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    System.out.println("Hello " + name + "\n" + "what is your password?");
    String password = scan.nextLine();
    while (loggedIn==false) {
      if (password.equals(key)) {
        System.out.println("logged in!");
        loggedIn = true;
        accountOpen = true;
      } else if (password.equals("q")) {
        System.out.println("exiting...");
        return;
      } else {
        System.out.println("wrong password! Try again" + "\n" + "Type 'q' to quit");
        password = scan.nextLine();
      }
    }
   
    if (loggedIn==true) {
      while (accountOpen ==true) {
        System.out.println("Do you want to find the area (a) or the perimeter (p) of the rectangle? (q to exit)");
        String operation= scan.nextLine();
        if (operation.equals("q")) {
              System.out.println("exiting...");
              return;
        } else if (operation.equals("a")||operation.equals("p")) {
          try {
            System.out.print("side 1: ");
            double side1 = scan.nextInt();
            System.out.print("side 2: ");
            double side2 = scan.nextInt();
            if (operation.equals("a")) {
              System.out.println((side1*side2));
            } else {
              System.out.println(2*(side1+side2));
            }
          } catch (Exception e) {
            System.out.println("Not a number");
          }
        }
      }
         
    }
   scan.close();
  }
}
