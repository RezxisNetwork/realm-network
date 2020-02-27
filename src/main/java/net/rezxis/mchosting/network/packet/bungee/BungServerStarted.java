package net.rezxis.mchosting.network.packet.bungee;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class BungServerStarted extends Packet {

	public String displayName;
	public int port;
	public String ip;
	
	public BungServerStarted(String displayName, String ip, int port) {
		super(PacketType.ServerStarted, ServerType.BUNGEE);
		this.displayName = displayName;
		this.port = port;
		this.ip = ip;
	}
}
