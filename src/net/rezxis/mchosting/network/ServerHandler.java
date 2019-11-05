package net.rezxis.mchosting.network;

import java.nio.ByteBuffer;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;

public interface ServerHandler {

	public void onOpen(WebSocket conn, ClientHandshake handshake);
	public void onClose(WebSocket conn, int code, String reason, boolean remote);
	public void onMessage(WebSocket conn, String message);
	public void onError(WebSocket conn, Exception ex);
	public void onMessage(WebSocket conn, ByteBuffer buffer);
	public void onStart();
}
