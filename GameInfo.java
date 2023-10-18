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
}