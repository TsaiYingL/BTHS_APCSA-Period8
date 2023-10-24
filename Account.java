import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Account
{
    private boolean loggedIn = false; //creating a boolean and printing it
    private boolean accountOpen = false;
    private User user;

    public Account (User user)
    {
        this.user = user;
    }
    public boolean getLoggedIn()
    {
        return loggedIn;
    }

    public void loggeedIn(boolean status)
    {
        this.loggedIn = status;
    }

    public boolean getAccoutOpen()
    {
        return accountOpen;
    }

    public void accountOpen(boolean status)
    {
        this.accountOpen = status;
    }

    public boolean isPassword(String key)
    {
      if (user.getPassword().equals(key))
      {
        return true;
      } else {
        return false;
      }
    }

    public static boolean doesUserExist(String user)
    {
      try 
      {
        FileReader file = new FileReader("UserInfo.txt");
        BufferedReader readFile = new BufferedReader(file);
        String info = readFile.readLine();
        while (info != null) 
        {
            if (info.contains(user)) 
            {
                readFile.close();
                System.out.println("user exists!!!");
                return true;
            }
            info = readFile.readLine();
        }
        readFile.close();
      } catch (Exception e) {
          System.out.println("Oh no!!! an error \n"+ e);
      }
      System.out.println("nooooo!!!!!");
      return false;
    }

    public void checkUser()
    {
        String username = user.getUsername();
        if (doesUserExist(username) == true)
        {
          String key = user.getPassword();
          while (isPassword(key) == false)
          {
            if (key == "q") {
              break;
            }
            System.out.println("Wrong password!!! Please try again.");
            Scanner scan = new Scanner(System.in);
            key = scan.nextLine();
            scan.close();
          }
          //user = new User(username, key);
        } else {
          System.out.println("No such user exists!!!");
        }
    }

    // public void loggingIn()
    // {
    //   Scanner scan = new Scanner(System.in);
    //   while (loggedIn==false)
    //   {
    //     if (user.getPassword().equals(key))
    //     {
    //       System.out.println("logged in!");
    //       loggeedIn(true);
    //       accountOpen(true);
    //       scan.close();
    //     } else if (user.getPassword().equals("q")) {
    //       System.out.println("exiting...");
    //       scan.close();
    //       return;
    //     } else {
    //       System.out.println("wrong password! Try again" + "\n" + "Type 'q' to quit");
    //       scan = scan.next();
    //     }
    //   }
    // }

}
