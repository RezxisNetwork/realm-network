package net.rezxis.mchosting.network.packet.sync;

import java.util.HashMap;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;
import net.rezxis.mchosting.network.packet.enums.BackupAction;

public class SyncBackupPacket extends Packet {

	public String owner;
	public BackupAction action;
	public HashMap<String, String> value;
	
	public SyncBackupPacket(String owner, BackupAction action, HashMap<String, String> value) {
		super(PacketType.Backup, ServerType.SYNC);
		this.owner = owner;
		this.action = action;
		this.value = value;
	}
}
