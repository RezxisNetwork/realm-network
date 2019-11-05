package net.rezxis.mchosting.network.packet.sync;

import java.util.HashMap;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncAuthSocketPacket extends Packet {

	/*
	 * Host options : 
	 *  id <int>
	 */
	
	/*
	 * Game options :
	 * port <int>
	 * id <int>
	 */
	public ServerType auth;
	public HashMap<String,String> options;
	
	public SyncAuthSocketPacket(ServerType auth,HashMap<String,String> options) {
		super(PacketType.AuthSocketPacket,ServerType.SYNC);
		this.auth = auth;
		this.options = options;
	}
}
