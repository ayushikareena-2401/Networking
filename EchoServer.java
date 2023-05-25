//Echo Server & Echo Client program.
//Echo Server.
import java.io.*;
import java.net.*;
import java.util.*;
class EchoServer{
  public static void main(String a[]) throws Exception{
    ServerSocket ss= new ServerSocket(9999);
    while(true) {
     Socket s = ss.accept();
     String line="";
     PrintStream ps = new PrintStream(s.getOutputStream());
     ps.println("Welcome to Echo client & Server.Type Bye to close.");
     do {
       DataInputStream ds = new DataInputStream(s.getInputStream());
       line= ds.readLine();
       if(line!=null) {
         System.out.println("Recieved: "+line);
       }
      }while(!line.trim().equalsIgnoreCase("Bye"));
     }
   }
}