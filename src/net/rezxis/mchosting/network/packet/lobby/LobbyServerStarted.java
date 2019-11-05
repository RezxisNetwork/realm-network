package net.rezxis.mchosting.network.packet.lobby;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class LobbyServerStarted extends Packet {

	public String player;
	
	public LobbyServerStarted(String player) {
		super(PacketType.ServerStarted, ServerType.LOBBY);
		this.player = player;
	}

}
