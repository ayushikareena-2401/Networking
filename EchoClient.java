//Echo Server & Echo Client program.
//Client Server.
import java.io.*;
import java.net.*;
import java.util.*;
class EchoClient{
  public static void main(String a[]) throws Exception{
     Socket s= new Socket("localhost",9999);
     PrintStream ps = new PrintStream(s.getOutputStream());
     DataInputStream ds = new DataInputStream(s.getInputStream());
     String l= ds.readLine();
     System.out.println(l);
     String line="";
     do {
       Scanner sc = new Scanner(System.in);
       line=sc.nextLine();
       ps.println(line);
      }while(!line.trim().equalsIgnoreCase("Bye"));
     s.close();
   }
}