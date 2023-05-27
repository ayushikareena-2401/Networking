//HTTP Protocol
/*
 *Here, you are supposed to create a url connection with the url provided and connect ut and                 in a new html page write the content of the html page whose url is provided. 
 */
import java.io.*;
import java.net.*;
import java.util.*;
class http {
   public static void main(String []a) throws Exception {
     URL url = new URL("https://www.google.co.in/"); 
     URLConnection conn= url.openConnection();
     InputStreamReader k = new InputStreamReader(conn.getInputStream());
     FileWriter f = new FileWriter("google.html");
     for(int i=0;i!=-1;i=k.read()) {
        f.write((char)i);
     }
    }
  }
     