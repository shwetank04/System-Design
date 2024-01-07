package TemplateDesignPattern;

public class Main {

	public static void main(String[] args) {
		Game game = new Cricket();
		game.initialize();
		game.startPlay();
		game.endPlay();
	}

}
