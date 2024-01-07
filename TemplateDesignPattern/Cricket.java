package TemplateDesignPattern;

public class Cricket extends Game {

	@Override
	public void initialize() {
		System.out.println("Initialize cricket");		
	}

	@Override
	public void startPlay() {
		System.out.println("Start cricket");		
		
	}

	@Override
	public void endPlay() {
		System.out.println("End cricket");		
		
	}

}
