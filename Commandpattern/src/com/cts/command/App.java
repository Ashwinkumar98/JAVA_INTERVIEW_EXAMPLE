package com.cts.command;

public class App {

	public static void main(String[] args) {
		
		Document doc = new Document();
		Command open = new OpenDocumentCommand(doc);
		Command close = new SaveDocumentCommand(doc);
		
		Switcher obj = new Switcher();
		obj.addcommand(open);
		obj.addcommand(close);
		obj.executeCommand();
	}

}
