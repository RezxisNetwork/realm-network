package net.rezxis.mchosting.network.packet.host;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class HostStoppedServer extends Packet {

	public String player;
	
	public HostStoppedServer(String player) {
		super(PacketType.ServerStopped, ServerType.HOST);
		this.player = player;
	}
}
