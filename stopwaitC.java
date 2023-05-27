//STOPWAIT PROTOCOL.
//Reciever side.
import java.io.*;
import java.net.*;
class stopwaitC{
 public static void main(String[] a)throws Exception{
  stopwaitC ob = new stopwaitC();
  ob.stpwt();
}
 public void stpwt()throws Exception {
  String s="haq", cmp="exit";
  ServerSocket ss = new ServerSocket(9999);
  Socket st=ss.accept();
  DataInputStream ds = new DataInputStream(st.getInputStream());
   PrintStream ps= new PrintStream(st.getOutputStream());
  while(s.compareTo(cmp)!=0) {
   Thread.sleep(1000);
 s=ds.readLine();
   if(s.compareTo(cmp)==0) {
     break;
   }
  Thread.sleep(1000);
  ps.println("Recieved");
  System.out.println("Recieved successfully.");
  }
 System.out.println("All frames are recieved successfully.");
}
}