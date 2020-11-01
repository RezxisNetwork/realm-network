package net.rezxis.mchosting.network.packet.all;

import lombok.Getter;
import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;

@Getter
public class ExecuteScriptPacket extends Packet {

	private String url;
	private String script;
	
	public ExecuteScriptPacket(String url, String script) {
		super(PacketType.ExecuteScriptPacket, null);
		this.url = url;
		this.script = script;
	}
}
