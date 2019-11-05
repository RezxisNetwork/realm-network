package net.rezxis.mchosting.network;

import java.nio.ByteBuffer;

import org.java_websocket.handshake.ServerHandshake;

public interface ClientHandler {

	public void onOpen(ServerHandshake handshakedata);
	public void onMessage(String message);
	public void onClose(int code, String reason, boolean remote);
	public void onMessage(ByteBuffer buffer);
	public void onError(Exception ex);
}
