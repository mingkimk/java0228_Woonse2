package Server1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket socket=new DatagramSocket(9999);
		byte buffer[]=new byte[256];
		DatagramPacket pk=null;
		while(true) {
			pk= new DatagramPacket(buffer,buffer.length);
			System.out.println("���� ����");
			socket.receive(pk);
			
			byte[]cMsg=pk.getData();
			String cMsgS=new String(cMsg);
			
			System.out.println("Ŭ���̾�Ʈ ����");
			System.out.println("i p: "+pk.getAddress());
			System.out.println("port: "+pk.getPort());
			
			System.out.println("message: "+cMsgS);
			
			InetAddress ip=pk.getAddress();
			int port=pk.getPort();
			Woonse1 w=new Woonse1();
			String msg=w.selWoonse();
			
			buffer=msg.getBytes();
			pk=new DatagramPacket(buffer,buffer.length,ip,port);
			
			socket.send(pk);
			
			
		}

	}

}
