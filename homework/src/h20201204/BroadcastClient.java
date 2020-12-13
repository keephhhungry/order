package h20201204;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
/**
 * @ahthor : cxyxh
 * @date : 2020/12/12 10:43
 * @describetion : 在多播组上广播消息并接收响应
 */
public class BroadcastClient {
	public static final int PORT = 1200;

	public static void main(String args[]) throws Exception {
		MulticastSocket socket = new MulticastSocket(BroadcastServer.PORT);
		InetAddress address  = InetAddress.getByName("224.0.0.1");
		DatagramPacket packet;

		// join a Multicast group and send the group //salutations
		socket.joinGroup(address);
		byte[] data = new byte[8192];
		packet = new DatagramPacket(data, data.length);
		for (;;) {
			// receive the packets
			socket.receive(packet);
			String str = new String(packet.getData());
			System.out.println(" Time signal received from" + packet.getAddress() + " Time is : " + str);
		} // end for

	}// end main

}// end class Broadcast
