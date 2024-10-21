package model;

public class Scanner implements Scannable, Xerocable {

	@Override
	public void scanDocument(String content) {
		System.out.println("SC: Digitalizando documento: \n" + content);
	}

	@Override
	public void xeroxDocument(String content) {
		System.out.println("SC: Xerocando documento: \n" + content);		
	}
}
