package net.rezxis.mchosting.network.packet.sync;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncServerStarted extends Packet {

	public String player;
	
	public SyncServerStarted(String player) {
		super(PacketType.ServerStarted,ServerType.SYNC);
		this.player = player;
	}
}
