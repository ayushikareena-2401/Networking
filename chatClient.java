//Chat Client and Chat Server.
//Client side.
import java.io.*;
import java.net.*;
import java.util.*;
class chatClient {
  public static void main(String a[]) throws Exception{
    //create a socket.
      Socket s= new Socket("localhost",9999);
      DataInputStream ds = new DataInputStream(s.getInputStream());
      String l="";
      String sk="";
      l=ds.readLine();
      System.out.println(l);
      PrintStream ps = new PrintStream(s.getOutputStream());
      do{
       Scanner sc= new Scanner(System.in);
       sk=sc.nextLine();
       System.out.println("Client:"+sk);
       ps.println(sk);
       l=ds.readLine();
       System.out.print("Server:"+l);
       }while(!sk.trim().equalsIgnoreCase("Bye"));
  }
}
     