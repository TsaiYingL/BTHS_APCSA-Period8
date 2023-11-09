public class GameInfo
{
  private int randomNum;
  private int numGuess;
  private boolean isNumberCorrect = false;

  public void randomNum (int randomNum)
  {
    this.randomNum = randomNum;
  }

  public int getRandomNum ()
  {
    return randomNum;
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
    randomNum = (int)(Math.random()*100+1);
    return randomNum;
  }

  public boolean numMatch(int num)
  {
    if (num == randomNum)
    {
      System.out.println("Correct!!! You guessed it! It took you " + numGuess + " times to get the number.");
      return true;
    } else {
      System.out.println("Wrong number!!! Try Again");
      numGuess +=1;
      return false;
    }
  }
}