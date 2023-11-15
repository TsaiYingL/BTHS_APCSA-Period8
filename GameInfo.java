public class GameInfo
{
  private int randomNum1;
  private int randomNum2;
  private int numGuess;
  private boolean isNumberCorrect = false;

  public void randomNum1 (int randomNum1)
  {
    this.randomNum1 = randomNum1;
  }

  public void randomNum2 (int randomNum2)
  {
    this.randomNum2 = randomNum2;
  }

  public int getRandomNum1 ()
  {
    return randomNum1;
  }

  public int getRandomNum2()
  {
    return randomNum2;
  }

  public void numGuess (int numGuess)
  {
    this.numGuess = numGuess;
  }

  public int getNumGuess ()
  {
    return numGuess;
  }

  public void isNumCorrect (boolean isNumberCorrect)
  {
    this.isNumberCorrect = isNumberCorrect;
  }

  public boolean getResult()
  {
    return isNumberCorrect;
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
    if (num.equals(randomNum1))
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
    if (num1.equals(randomNum1) && num2.equals(randomNum2))
    {
      System.out.println("Correct!!! You guessed it! It took you " +
numGuess + " times to guess both number.");
      return true;
    } else if (num1.equals(randomNum1) || num2.equals(randomNum2)) {
      System.out.println("The first number is: " +
num1.equals(randomNum1) + "\nThe second number is: " +
num2.equals(randomNum2));
      System.out.println("Please try again");
      numGuess +=1;
    } else {
      System.out.println("Both numbers are wrong!!! Try Again");
      numGuess +=1;
    }
    return false;
  }
}