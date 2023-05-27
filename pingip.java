//PINGIP
import java.io.*;
import java.net.*;
import java.util.*;
class pingip {
 public static void runCommand(String s){
try{
  Process p = Runtime.getRuntime().exec(s);
  BufferedReader ik =new BufferedReader(new InputStreamReader(p.getInputStream()));
  String sk="";
  while((sk=ik.readLine())!=null) {
    System.out.println(sk);
  }
 }catch(Exception e) {
   e.printStackTrace();
 }
 }
public static void main(String a[]){
  String ip="localhost";
  runCommand("ping "+ip);
 }
}
/*
import java.io.*;
import java.util.*;
public class pingip {
public static void runSystemCommand(String Command){
try{
Process p=Runtime.getRuntime().exec(Command);
BufferedReader InputStream=new BufferedReader(new
InputStreamReader(p.getInputStream()));
String s="";
while((s=InputStream.readLine())!=null){
System.out.println(s);
}
}
catch(Exception e){
e.printStackTrace();
}
}
public static void main(String a[]){
String ip="localhost";
runSystemCommand("ping "+ip);
Date date=new Date();
System.out.println(date);
}
}
*/
