package view;

import model.Fax;
import model.Faxable;
import model.Printable;
import model.Scannable;
import model.MultiFunctionalPrinter;
import model.Scanner;
import model.StandardPrinter;
import model.Xerocable;

public class Main {
	
	public static void main(String[] args) {
		String content = "Conteúdo para operação de I/O";
		
		// Dispositivos
		Fax fax = new Fax();
		MultiFunctionalPrinter mfPrinter = new MultiFunctionalPrinter();
		Scanner scanner = new Scanner();
		StandardPrinter stPrinter = new StandardPrinter();

		// Quem envia Fax
		fax(fax, content);
		fax(mfPrinter, content);
		
		// Quem imprime
		print(stPrinter, content);
		print(mfPrinter, content);
		
		// Quem digitaliza
		scann(scanner, content);
		scann(mfPrinter, content);
		
		// Quer tira xerox
		xerox(scanner, content);
		xerox(mfPrinter, content);
	}
	
	private static void fax(Faxable faxable, String content) {
		faxable.faxDocument(content);
	}
	
	private static void print(Printable printable, String content) {
		printable.printDocument(content);
	}
	
	private static void scann(Scannable scannable, String content) {
		scannable.scanDocument(content);
	}
	
	private static void xerox(Xerocable xerocable, String content) {
		xerocable.xeroxDocument(content);
	}
}
