package net.rezxis.mchosting.network;

import java.net.URI;
import java.nio.ByteBuffer;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

public class WSClient extends WebSocketClient {

	
	private ClientHandler handler;
	public WSClient(URI serverUri, ClientHandler handler) {
		super(serverUri);
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
}
