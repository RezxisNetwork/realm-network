package net.rezxis.mchosting.network.packet.host;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class HostCreateServer extends Packet {

	public String player;
	public String displayName;
	public String world;
	public String stype;
	
	public HostCreateServer(String player, String displayName, String enm, String stype) {
		super(PacketType.CreateServer, ServerType.HOST);
		this.player = player;
		this.displayName = displayName;
		this.world = enm;
		this.stype = stype;
	}
}