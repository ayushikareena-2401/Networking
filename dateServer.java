//To print the date of the server to the client side.
import java.io.*;
import java.net.*;
import java.util.*;
class dateServer {
  public static void main(String a[]) throws Exception{
    //first create the server socket.
    ServerSocket ss = new ServerSocket(9999);
    while(true) {
     //accept  the various clients.
     Socket s = ss.accept();
     PrintStream ps = new PrintStream(s.getOutputStream());
     ps.println(new Date());
     DataInputStream ds = new DataInputStream(s.getInputStream());
     String sk= ds.readLine(); 
     System.out.println("The ip address of the client is: "+sk);
     ps.close();
     s.close();
     }
    }
}
