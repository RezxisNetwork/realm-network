package net.rezxis.mchosting.network.packet.sync;

import java.util.UUID;

import lombok.Getter;
import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

@Getter
public class SyncPlayerMessagePacket extends Packet {

	private UUID target;
	private String message;
	
	public SyncPlayerMessagePacket(UUID target, String message) {
		super(PacketType.MESSAGE, ServerType.SYNC);
		this.target = target;
		this.message = message;
	}
}
