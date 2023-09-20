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
    while (loggedIn==false)
    {
      if (password.equals(key))
      {
        System.out.println("logged in!");
        loggedIn = true;
        accountOpen = true;
        scan.close();
      } else if (password.equals("q")) {
        System.out.println("exiting...");
        scan.close();
        return;
      } else {
        System.out.println("wrong password! Try again" + "\n" + "Type 'q' to quit");
        password = scan.nextLine();
      }
    }
   
    if (loggedIn==true)
    {
      Scanner scan2 = new Scanner(System.in);
      while (accountOpen ==true)
      {
        System.out.println("Do you want to find the product or the quotient(q to exit)?");
        String operation= scan2.nextLine();
        if (operation.equals("q"))
        {
              System.out.println("exiting...");
              return;
        } else if (operation.equals("product")||operation.equals("quotient")) {
          try
          {
            System.out.print("first num: ");
            double num1 = scan2.nextDouble();
            System.out.print("second num: ");
            double num2 = scan2.nextDouble();
            if (operation.equals("product")) {
              System.out.println(num1*num2);
            } else {
              System.out.println("result: " + num1/num2);
              if (num1==(int)num1 && num2 == (int)num2) {
              System.out.println("quotient: " + (int)(num1/num2) + " remainder: " + (int)(num1%num2));
              }
            }
          } catch (Exception e) {
            System.out.println(e);
          }
        }
      }
         
    }
   scan.close();
  }
}