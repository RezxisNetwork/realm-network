package net.rezxis.mchosting.network.packet.bungee;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class BungServerStopped extends Packet {

	public String name;
	
	public BungServerStopped(String name) {
		super(PacketType.ServerStopped, ServerType.BUNGEE);
		this.name = name;
	}
}
