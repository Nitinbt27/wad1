import java.io.PrintStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class ser {
public static void main(String args[]) throws IOException
	{ 
                 int number,temp;                    
                 ServerSocket  s1=new ServerSocket(1342);
                 Socket ss =s1.accept();
                 Scanner sc = new Scanner(ss.getInputStream());
                 number=sc.nextInt();
                 temp=number*2;
                 PrintStream p= new PrintStream(ss.getOutputStream());
                 p.println(temp);
}
}
