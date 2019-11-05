package net.rezxis.mchosting.network.packet.sync;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncServerCreated extends Packet {

	public String player;
	
	public SyncServerCreated(String player) {
		super(PacketType.ServerCreated, ServerType.SYNC);
		// TODO Auto-generated constructor stub
		this.player = player;
	}
}
