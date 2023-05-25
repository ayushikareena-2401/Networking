//To print the date of the server on the client side
//Client prgram.
import java.io.*;
import java.net.*;
import java.util.*;
class dateClient {
  public static void main(String a[]) throws Exception {
    //We will create a server socket.
    Socket s = new Socket("localhost",9999); 
    PrintStream ps = new PrintStream(s.getOutputStream()); 
    InetAddress ia =InetAddress.getLocalHost();
    ps.println(ia);
//To print the ip address of the cient.
   DataInputStream b= new DataInputStream(s.getInputStream());
   System.out.println("Date of the server:"+b.readLine());
   b.close();
   ps.close();
}
}
