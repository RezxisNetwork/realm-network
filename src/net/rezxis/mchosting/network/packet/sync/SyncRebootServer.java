package net.rezxis.mchosting.network.packet.sync;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncRebootServer extends Packet {

	public String owner;
	
	public SyncRebootServer(String owner) {
		super(PacketType.RebootServer, ServerType.SYNC);
		this.owner = owner;
	}
}
