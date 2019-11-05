package net.rezxis.mchosting.network;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

public class WSServer extends WebSocketServer {
	
	private ServerHandler handler;
	
	public WSServer(InetSocketAddress address, ServerHandler handler) {
		super(address);
		this.setConnectionLostTimeout(1);
		this.handler = handler;
	}

	@Override
	public void onOpen(WebSocket conn, ClientHandshake handshake) {
		handler.onOpen(conn, handshake);
	}

	@Override
	public void onClose(WebSocket conn, int code, String reason, boolean remote) {
		handler.onClose(conn, code, reason, remote);
	}

	@Override
	public void onMessage(WebSocket conn, ByteBuffer buffer) {
		handler.onMessage(conn, buffer);
	}
	
	@Override
	public void onMessage(WebSocket conn, String message) {
		handler.onMessage(conn, message);
	}

	@Override
	public void onError(WebSocket conn, Exception ex) {
		handler.onError(conn, ex);
	}

	@Override
	public void onStart() {
		handler.onStart();
	}
}
