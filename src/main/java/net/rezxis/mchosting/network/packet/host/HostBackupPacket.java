package net.rezxis.mchosting.network.packet.host;

import java.util.HashMap;

import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;
import net.rezxis.mchosting.network.packet.enums.BackupAction;

public class HostBackupPacket extends Packet {

	public String owner;
	public BackupAction action;
	public HashMap<String, String> value;
	
	public HostBackupPacket(String owner, BackupAction action, HashMap<String, String> value) {
		super(PacketType.Backup, ServerType.HOST);
		this.owner = owner;
		this.action = action;
		this.value = value;
	}
}