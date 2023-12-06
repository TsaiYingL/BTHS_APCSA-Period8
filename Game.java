import java.util.Scanner;

public class Game
{
  private int randomNum1;
  private int randomNum2;
  private int numGuess;

  public void gameStart()
  {
    Scanner scan = new Scanner(System.in);
    int level=-1;
    while (level < 1 || 2 < level)
    {
      System.out.println("Which level do you want to try? (1/2)")
      level = scan.nextint();
      if (1 > level || level < 2)
      {
        System.println("There's only 2 levels (1/2).")
      }
    }
    Scanner.close();
    randomNum1();
    randomNum2();
    for(i = 0; i<=20; i++)
    {
      System.out.println("Guess a number between 0 and 100 \nYou have " + i + " more chances");
      try {
        int num1 = scan.nextInt;
        if (level == 2)
        {
          int num2 = scan.nextInt;
          numMatchLevel2(num1, num2);
        } else {
          numMatchLevel2(num1);
        }
      } catch (expection e) {
        System.out.println("please enter a numerical value");
      }
    }
  }

  public void randomNum1()
  {
    this.randomNum1 = secretNum();
  }

  public void randomNum2()
  {
    this.randomNum2 = secretNum();
  }

  public int getRandomNum1()
  {
    return randomNum1;
  }

  public int getRandomNum2()
  {
    return randomNum2;
  }

  public void numGuess(int numGuess)
  {
    this.numGuess = numGuess;
  }

  public int getNumGuess()
  {
    return numGuess;
  }

  public int secretNum()
  {
    int randomNum = (int)(Math.random()*100+1);
    return randomNum;
  }

  public int restart()
  {
    System.out.println("Restart...");
    numGuess = 0;
    return numGuess;
  }

  public boolean numMatch(String num)
  {
    if (num.equals(getRandomNum1()))
    {
      System.out.println("Correct!!! You guessed it! It took you " +
numGuess + " times to get the number.");
      return true;
    } else {
      System.out.println("Wrong number!!! Try Again");
      numGuess +=1;
    }
    return false;
  }

  public boolean numMatchLevel2(String num1, String num2)
  {
    if (num1.equals(getRandomNum1()) && num2.equals(getRandomNum2()))
    {
      System.out.println("Correct!!! You guessed it! It took you " +
numGuess + " times to guess both number.");
      return true;
    } else if (num1.equals(getRandomNum1()) || num2.equals(getRandomNum2())) {
      System.out.println("The first number is: " +
num1.equals(getRandomNum1()) + "\nThe second number is: " +
num2.equals(getRandomNum2()));
      System.out.println("Please try again");
      numGuess +=1;
    } else {
      System.out.println("Both numbers are wrong!!! Try Again");
      numGuess +=1;
    }
    return false;
  }
}