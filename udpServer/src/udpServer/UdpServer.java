package udpServer;
import java.util.*;
import java.net.*;
public class UdpServer {
	
		public static void main(String a[]) throws Exception
		{
			DatagramSocket socket =new DatagramSocket(2022);
			byte data[]=new byte[1024];
			DatagramPacket packet =new DatagramPacket(data,data.length);
			socket.receive(packet);
			String msg=new String (packet.getData(),0,packet.getLength());
			System.out.println("Message:"+msg);
			String tomsg="Hello from server";
			byte[] todata=tomsg.getBytes();
			DatagramPacket toPack=new DatagramPacket(todata,todata.length,packet.getAddress(),packet.getPort());
			socket.send(toPack);
			socket.close();
		}
	}

