//Chat Client and Chat Server.
//Server side.
import java.io.*;
import java.net.*;
import java.util.*;
class chatServer {
  public static void main(String a[]) throws Exception{
    //create a server socket.
    ServerSocket ss= new ServerSocket(9999);
    //now accept to connect to the clients.
    while(true) {
      Socket s= ss.accept();
      PrintStream ps = new PrintStream(s.getOutputStream());
      ps.println("Welcome to chat client & server.");
      String l="";
      do{
       DataInputStream ds = new DataInputStream(s.getInputStream());
       System.out.print("Client:");
       l=ds.readLine();
       System.out.println(l);
       System.out.print("Server:");
       Scanner sc= new Scanner(System.in);
       String sk=sc.nextLine();
       ps.println(sk);
       }while(!l.trim().equalsIgnoreCase("Bye"));
    }
  }
}
       
       
       