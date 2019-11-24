package net.rezxis.mchosting.network.packet.sync;

import java.util.HashMap;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncFileLog extends Packet {

	
	public HashMap<String,String> values;
	
	public SyncFileLog(HashMap<String,String> values) {
		super(PacketType.FileLog,ServerType.SYNC);
		this.values = values;
	}
}
