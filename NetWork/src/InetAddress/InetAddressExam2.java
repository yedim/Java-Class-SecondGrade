package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam2 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia =InetAddress.getByName("java.sun.com");
		System.out.println("IP�ּ� : "+ia.getHostAddress());//156.151.59.19
		System.out.println("������ �̸� : "+ia.getHostName());//java.sun.com

	}
}
