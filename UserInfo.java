import java.util.Scanner;

public class UserInfo
{
  private String username;
  private String password;
  private int score;
  private double average;
  
  public UserInfo(String username, String password, int score,double average)
  {
    this.username = username;
    this.password = password;
    this.score = score;
    this.average = average;
  }

  public void username (String username)
  {
    this.username = username;
  }

  public String getUserName ()
  {
    return name;
  }
  
  public void pssword (String password)
  {
    this.password = poassword;
  }
  
  public String getPassword ()
  {
    return password;
  }
  
  public data(int score)
  {
    this.score = score;
  }
  
  public data(int score, double average)
  {
    this.score = score;
    this.average = average;
  }
  
  public int getScore()
  {
    return score;
  }
  
  public average ()
  {
    this.average = average;
  }
  
  public double getAverage()
  {
    return average;
  }
}