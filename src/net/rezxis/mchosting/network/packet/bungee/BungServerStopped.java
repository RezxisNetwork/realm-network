package net.rezxis.mchosting.network.packet.bungee;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class BungServerStopped extends Packet {

	public int port;
	
	public BungServerStopped(int port) {
		super(PacketType.ServerStopped, ServerType.BUNGEE);
		this.port = port;
	}
}
