package com.cts.command;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
	
	private List<Command> commands;
	
	public Switcher() {
		commands = new ArrayList<>();
	}
	
	public void addcommand(Command command) {
		commands.add(command);
	}
	
	public void executeCommand() {
		for(Command i : commands) {
			i.execute();
		}
	}
}
