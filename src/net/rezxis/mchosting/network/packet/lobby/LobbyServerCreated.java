package net.rezxis.mchosting.network.packet.lobby;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class LobbyServerCreated extends Packet {

	public String player;
	
	public LobbyServerCreated(String player) {
		super(PacketType.ServerCreated, ServerType.LOBBY);
		this.player = player;
	}
}
