package rchstsa.net;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

public class Server {
	
	/*
	 * Created 10-26-16
	 * 
	 * This class is meant to be ran on the RPi0
	 */
	
	public final int tcpPort = 58876;
	
	//The Kryonet server
	private com.esotericsoftware.kryonet.Server server;
	
	public Server() throws Exception {
		server = new com.esotericsoftware.kryonet.Server();
		server.start();
		server.bind(tcpPort);
	}
	
	public void startListening() {
		server.addListener(new Listener() {
		       public void received (Connection connection, Object object) {
		          
		       }
		    });
	}
	
	public com.esotericsoftware.kryonet.Server getKryoServer() {
		return this.server;
	}

}
