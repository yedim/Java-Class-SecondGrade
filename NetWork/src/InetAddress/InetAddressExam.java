package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia =InetAddress.getLocalHost();
		System.out.println("IP�ּ� : "+ia.getHostAddress());//10.96.123.191
	}
}
