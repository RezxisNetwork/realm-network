package net.rezxis.mchosting.network.packet.sync;

import java.util.Date;

import lombok.Getter;
import net.rezxis.mchosting.network.packet.Packet;
import net.rezxis.mchosting.network.packet.PacketType;
import net.rezxis.mchosting.network.packet.ServerType;

public class SyncAnniServerStatusSigns extends Packet {

	@Getter private final String serverName;
	@Getter private final boolean joinable;
	@Getter private final int maxPlayers;
	@Getter private final int onlinePlayers;
	@Getter private final boolean online;
	@Getter private final String ip;
	@Getter private final int port;
	@Getter private final String icon;
	@Getter private final String line1;
	@Getter private final String line2;
	@Getter private final String line3;
	@Getter private final String line4;
	@Getter private final Date lastUpdated;
	
	public SyncAnniServerStatusSigns(String serverName, boolean joinable, int maxPlayers, int onlinePlayers,
			boolean online, String ip, int port, String icon, String line1, String line2, String line3, String line4,
			Date lastUpdated) {
		super(PacketType.AnniServerStatusSigns, ServerType.ANNI);
		this.serverName = serverName;
		this.joinable = joinable;
		this.maxPlayers = maxPlayers;
		this.onlinePlayers = onlinePlayers;
		this.online = online;
		this.ip = ip;
		this.port = port;
		this.icon = icon;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.line4 = line4;
		this.lastUpdated = lastUpdated;
	}
}
