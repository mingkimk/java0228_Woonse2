package Client1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Main1 {

	public static void main(String[] args)throws Exception {
		DatagramSocket socket=new DatagramSocket();
		byte buffer[]=new byte[256];
		
		DatagramPacket pk=null;
		InetAddress ip=InetAddress.getByName("10.0.0.96");
		String msg="오늘의 운세 알려줘";
		buffer=msg.getBytes();
			
		pk=new DatagramPacket(buffer,buffer.length,ip,9999);
		
		socket.send(pk);
		
		buffer=new byte[256];
		pk= new DatagramPacket(buffer,buffer.length);
		socket.receive(pk);
		
		byte[]cMsg=pk.getData();
		String cMsgS= new String(cMsg);
		
		System.out.println("클라이언트 정보 ");
		System.out.println("i p: "+pk.getAddress());
		System.out.println("port: "+pk.getPort());
		System.out.println("message: "+cMsgS);

	}

}
