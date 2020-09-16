package net.rezxis.mchosting.network.packet.sync;

import lombok.Getter;
import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncPingPacket extends Packet {

	@Getter private Type type;
	
	public SyncPingPacket(Type type) {
		super(PacketType.Ping, ServerType.SYNC);
		this.type = type;
	}
	
	public static enum Type {
		PING,PONG;
	}
}
