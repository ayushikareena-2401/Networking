//TraceRoute
import java.io.*;
import java.util.*;
public class traceroute {
 public static void SystemCommand(String Command){
  try{
    Process p=Runtime.getRuntime().exec(Command);
    BufferedReader InputStream=new BufferedReader(new InputStreamReader(p.getInputStream()));
    String s=" ";
    while((s=InputStream.readLine())!=null){
     System.out.println(s);
    }
   }catch(Exception e){
    e.printStackTrace();
  }
 }
 public static void main(String[] args) {
  String Ip="www.google.co.in";
  SystemCommand("tracert "+Ip);
 }
}
