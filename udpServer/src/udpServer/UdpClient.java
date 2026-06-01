package udpServer;

public class UdpClient {
	
		public static void main (String a[]) throws Exception
		{
			DatagramSocket socket =new DatagramSocket();
			String msg="Hello from client";
			byte bmsg[]=msg.getBytes();
			InetAddress address= InetAddress.getByName("localhost");
			DatagramPacket packet=new DatagramPacket(bmsg,bmsg.length,address,2022);
			socket.send(packet);
			byte[] smsg=new byte[1024];
			DatagramPacket spacket =new DatagramPacket(smsg,smsg.length);
			socket.receive(spacket);
			String smessage=new String(spacket.getData(),0,spacket.getLength());
			System.out.println("servermessage:"+smessage);
			socket.close();
		}

	}


