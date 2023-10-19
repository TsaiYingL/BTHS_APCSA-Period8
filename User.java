import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class User
{
  private String username;
  private String password;
  private int score;
  private double average;
  
  public User(String username, String password, int score, int average)
  {
    this.username = username;
    this.password = password;
    this.score = score;
    this.average = average;
  }

  // public String toString()
  // {
  //   return "\nUser Name: " + username + "\n" +
  //   "Password: " + password  + "\n" +
  //   "Score: " + score + "\n" +
  //   "Average: " + average;
  // }

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
  
  public void average (double average)
  {
    this.average = average;
  }
  
  public double getAverage()
  {
    return average;
  }

  public Object[] getUser()
  {
    Object[] userList = new Object[] {getUserName(),getPassword(),getScore(),getAverage()};
    return userList;
  }
  
  public void addUser()
  {
    try {
    FileWriter myWriter = new FileWriter("UserInfo.txt", true);
    myWriter.write(Arrays.toString(getUser())+ "\n");
    myWriter.close();
    System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
    }
  }
}