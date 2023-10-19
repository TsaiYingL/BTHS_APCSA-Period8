import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;
import java.util.Arrays;

public class CreateAccount
{
  public ArrayList<User> getUser()
  {
    ArrayList<User> userList = new ArrayList<User>();
    userList.add(User);
    return userList;
  }

  public static void addUser(ArrayList<User> user)
  {
    try {
    FileWriter myWriter = new FileWriter("UserInfo.txt");
    //String userAsString = Arrays.toString(user);
    //myWriter.write(userAsString);
    myWriter.close();
    System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
    }
  }

}
