package net.rezxis.mchosting.network.packet;

public class Packet {

	public ServerType dest;
	public PacketType type;
	
	public Packet(PacketType type, ServerType dest) {
		this.dest = dest;
		this.type = type;
	}
}
