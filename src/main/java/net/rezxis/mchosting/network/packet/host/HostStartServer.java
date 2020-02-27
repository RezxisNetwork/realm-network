package net.rezxis.mchosting.network.packet.host;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class HostStartServer extends Packet {

	public String player;
	
	public HostStartServer(String player) {
		super(PacketType.StartServer, ServerType.HOST);
		this.player = player;
	}
}

