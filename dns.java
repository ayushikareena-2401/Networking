//DNS-domain name server.
//Here we are having 3 options ~ giving name() and getting the DNS and reverse DNS(with the ip address getting the name)
import java.io.*;
import java.util.*;
import java.net.*;
class DNS {
 public static void main(String a[]) throws Exception{
   int n;
   Scanner sc = new Scanner(System.in);
   do{
   System.out.println("Menu:\n 1.DNS\n 2.Reverese\n 3.Exit ");
   n=sc.nextInt();
   if(n==1) {
    String sk="";
    sk=sc.next();
    System.out.println("Enter the name~");
    sk=sc.nextLine();
    InetAddress ia =InetAddress.getByName(sk);
    System.out.println("Host name:"+ia.getHostName());
    System.out.println("IP:"+ia.getHostAddress());
   } else if(n==2) {
    String sk="";
    System.out.println("Enter the ip address~");
    sk=sc.next();
    sk=sc.nextLine();
    InetAddress ia =InetAddress.getByName(sk);
    System.out.println("Host name:"+ia.getHostName());
    System.out.println("IP:"+ia);
  }
  }while(!(n==3));
 }
}



