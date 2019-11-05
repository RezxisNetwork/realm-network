package net.rezxis.mchosting.network.packet.bungee;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class BungPlayerSendPacket extends Packet {

	public String player;
	public String server;
	
	public BungPlayerSendPacket(String player, String dest) {
		super(PacketType.PlayerSendPacket,ServerType.BUNGEE);
		this.player = player;
		this.server = dest;
	}
}
