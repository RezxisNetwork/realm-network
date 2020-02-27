package net.rezxis.mchosting.network.packet.sync;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncStopServer extends Packet {

	public String player;
	
	public SyncStopServer(String player) {
		super(PacketType.StopServer, ServerType.SYNC);
		this.player = player;
	}
}
