import java.lang.*;
import java.util.*;
public class UserInput{
   public static void main(String[] args) {
      System.out.print("Enter Your Name:");
      Scanner userInput = new Scanner(System.in);
      String UserName = userInput.nextLine();
      System.out.println("Your Name  is:- " + UserName);
   }
}