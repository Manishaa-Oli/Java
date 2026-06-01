package udpServer;
import java.net.*;
import java.io.*;

public class TcpServer {


		public static void main (String a[]) throws Exception
		{
			ServerSocket ss=new ServerSocket (2024);
			Socket socket=ss.accept();
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
			String cmsg=br.readLine();
			System.out.println("Client:"+cmsg);
			out.println("Hi from server");
			out.flush();
			out.close();
			br.close();
			socket.close();
			ss.close();
		}

	}

