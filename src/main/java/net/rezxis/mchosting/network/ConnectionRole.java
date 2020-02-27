package net.rezxis.mchosting.network;

public enum ConnectionRole {

	GAME(0,"GAME"),BUNGEECORD(1,"BUNGEECORD"),LOBBY(2,"LOBBY"),UNKNOWN(-1,"UNKNOWN");
	
	int id;
	String type;
	
	ConnectionRole(int id, String name) {
		this.id = id;
		this.type = name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getType() {
		return this.type;
	}
}
