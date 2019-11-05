package net.rezxis.mchosting.network.packet.game;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class GameStopServer extends Packet {

	public GameStopServer() {
		super(PacketType.StopServer,ServerType.GAME);
	}
}
