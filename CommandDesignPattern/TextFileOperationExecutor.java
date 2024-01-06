package CommandDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {
	
	private List<TextFileOperation> textFileOperation = new ArrayList<>();
	
	public void executeOperation(TextFileOperation textFileOperation) {
		this.textFileOperation.add(textFileOperation);
		textFileOperation.execute();
	}

}
