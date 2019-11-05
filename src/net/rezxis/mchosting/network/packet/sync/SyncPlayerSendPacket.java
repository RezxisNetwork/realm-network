package net.rezxis.mchosting.network.packet.sync;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncPlayerSendPacket extends Packet {

	public String uuid;
	public String server;
	
	public SyncPlayerSendPacket(String uuid, String server) {
		super(PacketType.PlayerSendPacket,ServerType.SYNC);
		this.uuid = uuid;
		this.server = server;
	}
}
