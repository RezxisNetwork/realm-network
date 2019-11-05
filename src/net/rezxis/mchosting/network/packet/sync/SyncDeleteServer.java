package net.rezxis.mchosting.network.packet.sync;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncDeleteServer extends Packet {

	public String player;
	
	public SyncDeleteServer(String player) {
		super(PacketType.DeleteServer,ServerType.SYNC);
		this.player = player;
	}
}
