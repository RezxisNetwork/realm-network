package net.rezxis.mchosting.network.packet.host;

import java.util.HashMap;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class HostWorldPacket extends Packet {

	public HashMap<String,String> values;
	public Action action;
	
	public HostWorldPacket(HashMap<String,String> values, Action action) {
		super(PacketType.World, ServerType.HOST);
		this.values = values;
		this.action = action;
	}
	
	public enum Action {
		DOWNLOAD,UPLOAD
	}
}
