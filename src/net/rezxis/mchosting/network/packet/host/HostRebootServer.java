package net.rezxis.mchosting.network.packet.host;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class HostRebootServer extends Packet {

	public int id;
	
	public HostRebootServer(int id) {
		super(PacketType.RebootServer,ServerType.HOST);
		this.id = id;
	}
}
