package net.rezxis.mchosting.network.packet.sync;

import java.util.HashMap;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncWorldPacket extends Packet {

	/*
	 * map (uuid,secret)
	 */
	
	public HashMap<String,String> values;
	public Action action;
	
	public SyncWorldPacket(HashMap<String,String> values, Action action) {
		super(PacketType.World, ServerType.SYNC);
		this.values = values;
		this.action = action;
	}
	
	public enum Action {
		DOWNLOAD,UPLOAD
	}
}
