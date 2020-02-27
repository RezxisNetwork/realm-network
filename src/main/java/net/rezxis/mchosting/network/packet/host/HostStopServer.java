package net.rezxis.mchosting.network.packet.host;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class HostStopServer extends Packet {

	public String player;
	
	public HostStopServer(String player) {
		super(PacketType.StopServer, ServerType.HOST);
		this.player = player;
	}
}
