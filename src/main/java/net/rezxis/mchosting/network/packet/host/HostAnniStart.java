package net.rezxis.mchosting.network.packet.host;

import lombok.Getter;
import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class HostAnniStart extends Packet {

	@Getter private int port;
	
	public HostAnniStart(int port) {
		super(PacketType.AnniStart, ServerType.HOST);
		this.port = port;
	}
}
