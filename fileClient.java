//File Server and File Client.
//Client side.
//Here the server is getting the data stored in a file a the client side and storing it in a file.
import java.io.*;
import java.util.*;
import java.net.*;
class fileClient {
  public static void main(String a[]) throws Exception {
    Socket s = new Socket("localhost",9999);
    System.out.println("Connection Established:");
    FileInputStream f = new FileInputStream("i.txt");
    int i=0;
    DataOutputStream ds = new DataOutputStream(s.getOutputStream());
    byte[] arr = new byte[1024];
    while((i=f.read(arr))>0) {
      ds.write(arr,0,i);
    }
    f.close();
    ds.close();
    s.close();
  }
}
     