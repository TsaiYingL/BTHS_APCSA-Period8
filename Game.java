public class GameInfo
{
  private int randomNum;
  private int numGuess;
  private boolean isNumberCorrect = False;
  
  public void randomNum (int randomNum)
  {
    this.randomNum = randomNum;
  }

  public Int getRandomNum ()
  {
    return randomNum;
  }
  
  public void numGuess (int numGuess)
  {
    this.numGuess = numGuess;
  }

  public Int getNumGuess ()
  {
    return numGuess;
  }
  
  public void isNumCorrect (blooean isNumCorrect)
  {
    this.isNumCorrect = isNumCorrect;
  }
  
  public blooean getResult()
  {
    return isNumCorrect;
  }
}