import java.io.*;
import java.net.*;

public class TCPserver {
  public static void main(String[] args) {
    try {
      ServerSocket serverSocket = new ServerSocket(5000);
      System.out.println("Server is running");
      Socket clientSocket = serverSocket.accept();
      System.out.println("Client connected");
      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
      String received = in.readLine();
      System.out.println("Received from Client: " + received);
      String response = received.toUpperCase();
      System.out.println(response);
      out.println(response);
      in.close();
      out.close();
      clientSocket.close();
      serverSocket.close();
      System.out.println("Connection closed");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
