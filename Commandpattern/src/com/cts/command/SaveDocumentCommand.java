package com.cts.command;

public class SaveDocumentCommand implements Command{
	
	private Document document;
	
	
	
	public SaveDocumentCommand(Document document) {
		this.document = document;
	}



	@Override
	public void execute() {
		this.document.SaveDocument();
	}
	
}
