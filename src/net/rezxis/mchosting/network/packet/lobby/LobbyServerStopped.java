package net.rezxis.mchosting.network.packet.lobby;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class LobbyServerStopped extends Packet {

	public String player;
	
	public LobbyServerStopped(String player) {
		super(PacketType.ServerStopped,ServerType.LOBBY);
		this.player = player;
	}
}
