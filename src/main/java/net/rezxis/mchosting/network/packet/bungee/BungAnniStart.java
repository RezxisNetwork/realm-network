package net.rezxis.mchosting.network.packet.bungee;

import lombok.Getter;
import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class BungAnniStart extends Packet {

	@Getter private String name;
	
	public BungAnniStart(String name) {
		super(PacketType.AnniStart, ServerType.BUNGEE);
		this.name = name;
	}
}
