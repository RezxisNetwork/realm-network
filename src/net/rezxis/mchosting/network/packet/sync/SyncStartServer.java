package net.rezxis.mchosting.network.packet.sync;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncStartServer extends Packet {

	public String player;
	
	public SyncStartServer(String player) {
		super(PacketType.StartServer, ServerType.SYNC);
		this.player = player;
	}
}
