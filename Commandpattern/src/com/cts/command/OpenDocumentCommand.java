package com.cts.command;

public class OpenDocumentCommand implements Command{
	
	private Document document;
			
	public OpenDocumentCommand(Document document) {
		this.document = document;
	}


	@Override
	public void execute() {
		this.document.OpenDocument();
	}

}
