package h20201204;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Date;

public class BroadcastServer {
	public static final int PORT = 1200; 
	public static void main(String args[])throws Exception { 
		MulticastSocket socket = new MulticastSocket();
		InetAddress address = InetAddress.getByName("224.0.0.1");
		DatagramPacket packet; 
			
		//join a Multicast group  
		socket.joinGroup(address); 
		byte[] data = null; 
		for(;;){ 
			Thread.sleep(1000); 
			System.out.println("Sending "); 
			String str = (new Date()).toString(); 
			data = str.getBytes(); 
			packet = new DatagramPacket(data,str.length(),address,PORT);
			//Sends the packet 
			socket.send(packet); 
			}//end for 
		}//end main 
	 }//end class BroadcastServer
