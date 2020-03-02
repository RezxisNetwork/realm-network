package net.rezxis.mchosting.network.packet.bungee;

import java.util.UUID;

import lombok.Getter;
import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

@Getter
public class BungPlayerMessagePacket extends Packet {

	private UUID target;
	private String message;
	
	public BungPlayerMessagePacket(UUID target, String message) {
		super(PacketType.MESSAGE, ServerType.BUNGEE);
		this.target = target;
		this.message = message;
	}
}
