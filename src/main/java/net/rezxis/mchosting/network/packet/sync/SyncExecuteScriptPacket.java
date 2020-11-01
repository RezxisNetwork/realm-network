package net.rezxis.mchosting.network.packet.sync;

import lombok.Getter;
import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

@Getter
public class SyncExecuteScriptPacket extends Packet {

	private String url;
	private String script;
	private ScriptTarget target;
	private int targetID;
	
	public SyncExecuteScriptPacket(String url, String script,
			ScriptTarget target, int targetID) {
		super(PacketType.ExecuteScriptPacket,ServerType.SYNC);
		this.url = url;
		this.script = script;
		this.target = target;
		this.targetID = targetID;
	}
	
	public static enum ScriptTarget {
		Bungee,Game,Host,Lobby,Sync
	}
}
