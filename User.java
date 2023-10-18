public class User
{
  private String username;
  private String password;
  private int score;
  private double average;
  
  public User(String username, String password)
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
    return username;
  }
  
  public void password (String password)
  {
    this.password = password;
  }
  
  public String getPassword ()
  {
    return password;
  }
  
  public void data(int score)
  {
    this.score = score;
  }
  
  public void data(int score, double average)
  {
    this.score = score;
    this.average = average;
  }
  
  public int getScore()
  {
    return score;
  }
  
  public void average ()
  {
    this.average = average;
  }
  
  public double getAverage()
  {
    return average;
  }
}