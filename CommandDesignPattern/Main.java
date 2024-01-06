package CommandDesignPattern;

public class Main {

	public static void main(String[] args) {
		TextFileOperationExecutor exec = new TextFileOperationExecutor();
		exec.executeOperation(new OpenTextFileOperation(new Textfile()));
	}
}
