import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Hello! what is your name?");
    Scanner scan = new Scanner(System.in);
    String username = scan.nextLine();
    System.out.println("What is your password?");
    String password = scan.nextLine();
    scan.close();
    User tsai = new User(username, password);
    Account account = new Account(tsai);
    account.doesUserExist(username + ", " + password);

//    User u = new User("mrHolmer", "password", 100, 100);
//    System.out.println(u.getUser());
//    u.addUser();
//    User tsaiYing = new User("tsaiYing", "word", 1000, 500);
//    tsaiYing.addUser();
    // User[] users = new User[3];
    // users[0] = u;
    // System.out.println(users[0]);

    // ArrayList<User> userList = new ArrayList<User>();
    // userList.add(u);
    // userList.add(tsaiYing);
    // System.out.println(userList);

  //   Account user = new Account();
  //   user.loggingIn();

  //   if (user.loggedIn()==true)
  //   {
  //     Scanner scan2 = new Scanner(System.in);
  //     while (user.accoutOpen() ==true)
  //     {
  //       System.out.println("Do you want to find the product or the quotient(q to exit)?");
  //       String operation= scan2.nextLine();
  //       if (operation.equals("q"))
  //       {
  //             System.out.println("exiting...");
  //             scan2.close();
  //             return;
  //       } else if (operation.equals("product")||operation.equals("quotient")) {
  //         try
  //         {
  //           System.out.print("first num: ");
  //           double num1 = scan2.nextDouble();
  //           System.out.print("second num: ");
  //           double num2 = scan2.nextDouble();
  //           if (operation.equals("product")) {
  //             System.out.println(num1*num2);
  //           } else {
  //             System.out.println("result: " + num1/num2);
  //             if (num1==(int)num1 && num2 == (int)num2) {
  //             System.out.println("quotient: " + (int)(num1/num2) + "remainder: " + (int)(num1%num2));
  //             }
  //           }
  //         } catch (Exception e) {
  //           System.out.println(e);
  //         }
  //       }
  //     }
  //     scan2.close();
  //   }
  // }
  }
}