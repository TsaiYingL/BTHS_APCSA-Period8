import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateAccount
{
    public static void addUser(String user) {
        try {
        FileWriter myWriter = new FileWriter("UserInfo.txt");
        myWriter.write(user);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }

}
