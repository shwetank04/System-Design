package CommandDesignPattern;

public class OpenTextFileOperation implements TextFileOperation {

	private Textfile textFile;

	public OpenTextFileOperation(Textfile textFile) {
		this.textFile = textFile;
	}


	@Override
	public void execute() {
		textFile.open();
	}

}
