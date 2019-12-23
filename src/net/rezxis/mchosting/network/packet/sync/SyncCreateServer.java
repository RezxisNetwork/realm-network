package net.rezxis.mchosting.network.packet.sync;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncCreateServer extends Packet {

	public String player;
	public String displayName;
	public String world;
	public String stype;
	
	public SyncCreateServer(String player, String displayName, String enm, String stype) {
		super(PacketType.CreateServer, ServerType.SYNC);
		this.player = player;
		this.displayName = displayName;
		this.world = enm;
		this.stype = stype;
	}
}
