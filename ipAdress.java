//To print the ip address of the system.
import java.io.*;
import java.net.*;
class ipAdress {
  public static void main(String a[]) {
   try  {
    InetAddress ia=InetAddress.getLocalHost();
    System.out.println("The ip address of the system is: "+ia);
  }catch(IOException e) {
    System.out.println("The exception is:"+e);
  }
}
}