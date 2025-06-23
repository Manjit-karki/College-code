import java.io.*;
import java.net.*;

public class TCPClient {
  public static void main(String[] args) {
    try {
      Socket socket = new Socket("localhost", 5000);

      BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

      System.out.println("Enter string:");
      String message = userInput.readLine();

      out.println(message);

      String response = in.readLine();
      System.out.println("Uppercase from server: " + response);

      userInput.close();
      in.close();
      out.close();
      socket.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
