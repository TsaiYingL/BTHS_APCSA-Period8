  import java.util.Scanner;
  
  public void gameStart()
  {
    Scanner scan = new Scanner(System.in);
    int level=-1;
    int secretNum = secretNum();
    int num1;
    int num
    while (level < 1 || 2 < level)
    {
      System.out.println("Which level do you want to try? (1/2)")
      level = scan.nextint();
      if (1 > level || level < 2)
      {
        System.println("There's only 2 levels (1/2).")
      }
    }
    for(i = 0; i<=20; i++)
    {
      System.out.println("Guess a number between 0 and 100 \nYou have " + i + " more chances");
      if (level == 1)
      {
        System.out.println("Guess 1 number: ")

      }
    }
  }