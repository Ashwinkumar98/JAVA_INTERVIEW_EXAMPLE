package com.cts.toll;

import java.util.List;

public class MapRoute {
	private char source;
	private char destination;
	private char[] wavepoints;
	private List<Toll> tolls;
	
	public MapRoute(char source, char destination, char[] wavepoints, List<Toll> tolls) {
		this.source = source;
		this.destination = destination;
		this.wavepoints = wavepoints;
		this.tolls = tolls;
	}
	
	public char getSource() {
		return source;
	}
	public void setSource(char source) {
		this.source = source;
	}
	public char getDestination() {
		return destination;
	}
	public void setDestination(char destination) {
		this.destination = destination;
	}
	public char[] getWavepoints() {
		return wavepoints;
	}
	public void setWavepoints(char[] wavepoints) {
		this.wavepoints = wavepoints;
	}
	public List<Toll> getTolls() {
		return tolls;
	}
	public void setTolls(List<Toll> tolls) {
		this.tolls = tolls;
	}
	
	
}
