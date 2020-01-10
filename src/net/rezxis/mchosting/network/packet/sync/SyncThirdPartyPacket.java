package net.rezxis.mchosting.network.packet.sync;

import lombok.Getter;
import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

@Getter
public class SyncThirdPartyPacket extends Packet {

	private Action action;
	private String key;
	
	public SyncThirdPartyPacket(String key, Action act) {
		super(PacketType.ThirdParty,ServerType.SYNC);
		this.key = key;
		this.action = act;
	}
	
	public enum Action {
		START,STOP;
	}
}
