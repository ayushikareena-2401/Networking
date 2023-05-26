//File Server and File Client.
//Server side.
//Here the server is getting the data stored in a file a the client side and storing it in a file.
import java.io.*;
import java.util.*;
import java.net.*;
class fileServer {
  public static void main(String a[]) throws Exception {
    ServerSocket ss = new ServerSocket(9999);
    int i=0;
    Socket s = ss.accept();
    System.out.println("Connection Established:");
    DataInputStream ds = new DataInputStream(s.getInputStream());
    FileOutputStream f = new FileOutputStream("o.txt");
    byte[] arr = new byte[1024];
    while((i=ds.read(arr))>0) {
      f.write(arr,0,i);
    }
    f.close();
    ds.close();
    s.close();
    ss.close();
  }
}
     