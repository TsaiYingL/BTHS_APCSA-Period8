import java.util.Scanner;

public class Account {
    private boolean loggedIn = false; //creating a boolean and printing it
    private String key = "a";
    private boolean accountOpen = false;

    public boolean loggedIn()
    {
        return loggedIn;
    }

    public void isLoggeedIn(boolean status)
    {
        this.loggedIn = status;
    }

    public boolean accoutOpen()
    {
        return accountOpen;
    }

    public void isAccountOpen(boolean status)
    {
        this.accountOpen = status;
    }
   
    public void loggingIn()
    {
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
          isLoggeedIn(true);
          isAccountOpen(true);;
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
    }
    
}
