package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServerExam2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(416);
		byte[] data = new byte[65508];
		
		DatagramPacket dp = new DatagramPacket(data,data.length);
		System.out.println("UDP���� �����");
		
		while(true)
		{
			ds.receive(dp);
			String msg=new String(dp.getData()).trim();
			System.out.println("���� �ּ� : "+dp.getAddress());
			System.out.println("���� �޽��� : "+msg);
		}
	}

}
