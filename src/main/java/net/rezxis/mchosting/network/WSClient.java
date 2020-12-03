package net.rezxis.mchosting.network;

import java.net.URI;
import java.nio.ByteBuffer;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

public class WSClient extends WebSocketClient {

	
	private ClientHandler handler;
	private boolean exit;
	
	public boolean isGoingExit() {
		return exit;
	}
	
	public void setGoingExit(boolean bool) {
		this.exit = bool;
	}
	
	public WSClient(URI serverUri, ClientHandler handler) {
		super(serverUri);
		this.setReuseAddr(true);
		this.handler = handler;
	}

	@Override
	public void onOpen(ServerHandshake handshakedata) {
		handler.onOpen(handshakedata);
	}

	@Override
	public void onMessage(ByteBuffer buffer) {
		handler.onMessage(buffer);
	}
	
	@Override
	public void onMessage(String message) {
		handler.onMessage(message);
	}

	@Override
	public void onClose(int code, String reason, boolean remote) {
		handler.onClose(code, reason, remote);
	}

	@Override
	public void onError(Exception ex) {
		handler.onError(ex);
	}
	
	public void startReconnectQueue() {
		new Thread(new ReconnectQueue(this)).start();
	}
	
	public class ReconnectQueue implements Runnable {

		private WSClient client;
		
		public ReconnectQueue(WSClient client) {
			this.client = client;
		}
		
		@Override
		public void run() {
			while(true) {
				if (!exit) {
					if (client.isClosed()) {
						System.out.println("reconnecting!");
						client.reconnect();
					}
				} else {
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
