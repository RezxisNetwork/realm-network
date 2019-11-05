package net.rezxis.mchosting.network.packet.host;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class HostDeleteServer extends Packet {

	public int id;
	
	public HostDeleteServer(int id) {
		super(PacketType.DeleteServer, ServerType.HOST);
		this.id = id;
	}
}
