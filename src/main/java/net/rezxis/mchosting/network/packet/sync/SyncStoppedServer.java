package net.rezxis.mchosting.network.packet.sync;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncStoppedServer extends Packet {

	public int serverID;
	
	public SyncStoppedServer(int id) {
		super(PacketType.ServerStopped,ServerType.SYNC);
		this.serverID = id;
	}
}
