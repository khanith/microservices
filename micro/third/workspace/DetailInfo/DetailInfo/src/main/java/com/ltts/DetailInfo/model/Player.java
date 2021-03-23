package com.ltts.DetailInfo.model;

public class Player {
	private int playerno;
	private String playerame;
	private String playercountry;
	
	
	public Player() {
		super();
	}


	public Player(int playerno, String playerame, String playercountry) {
		super();
		this.playerno = playerno;
		this.playerame = playerame;
		this.playercountry = playercountry;
	}


	public int getPlayerno() {
		return playerno;
	}


	public void setPlayerno(int playerno) {
		this.playerno = playerno;
	}


	public String getPlayerame() {
		return playerame;
	}


	public void setPlayerame(String playerame) {
		this.playerame = playerame;
	}


	public String getPlayercountry() {
		return playercountry;
	}


	public void setPlayercountry(String ownername) {
		this.playercountry = ownername;
	}


	@Override
	public String toString() {
		return "Player [playerno=" + playerno + ", playerame=" + playerame + ", playercountry=" + playercountry + "]";
	}
	
	
}