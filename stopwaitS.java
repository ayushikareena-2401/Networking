//STOPWAIT PROTOCOL.
//Sender's side.
import java.io.*;
import java.util.*;
import java.net.*;
class stopwaitS {
  public static void main(String[] a) throws Exception{
   stopwaitS ob = new stopwaitS();
   ob.stpwt();
   }
  public void stpwt() throws Exception{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the numbers of frames to be sent");
   int n=sc.nextInt();
   Socket s= new Socket("localhost",9999);
   PrintStream ps= new PrintStream(s.getOutputStream());
   DataInputStream ds = new DataInputStream(s.getInputStream());
   for(int i=1;i<=n;i++) {
    if(i==n) {
     ps.println("exit");
     break;
    }
    System.out.println("Frame no "+i+" is sent.");
    ps.println(i);
    String a=ds.readLine();
    System.out.println(a);
    }
   }
}