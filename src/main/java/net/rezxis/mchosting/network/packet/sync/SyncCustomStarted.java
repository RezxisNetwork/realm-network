package net.rezxis.mchosting.network.packet.sync;

import lombok.Getter;
import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

@Getter
public class SyncCustomStarted extends Packet {

	private int id;
	private String ip;
	
	public SyncCustomStarted(int id,String ip) {
		super(PacketType.CustomStart, ServerType.SYNC);
		this.id = id;
		this.ip = ip;
	}
}