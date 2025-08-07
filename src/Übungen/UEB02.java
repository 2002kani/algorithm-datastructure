package Übungen;

public class UEB02 {
	
	public static void main(String[] args) {
		
		/* Aufgabe 1)
		 * 
		 * Link<String> mittleresElement = new Link<String>("Test", null);
		 * 
		 * mittleresElement.naechster = new Link<String>("Letzter", null);
		 * 
		 * Link<String> anfang = new Link<String>("Erster", mittleresElement);
		 * 
		 * 
		*/
		
		Link<String> sprache1 = new Link<String>("Javascript", null);
		Link<String> sprache2 = new Link<String>("Java", null);
		Link<String> sprache3 = new Link<String>("Phyton", null);
		Link<String> sprache4 = new Link<String>("Rust", null);
		Link<String> sprache5 = new Link<String>("C#", null);
		Link<String> sprache6 = new Link<String>("Go", null);
		
		sprache1.naechster = sprache2;
		sprache2.naechster = sprache3;
		sprache3.naechster = sprache4;
		sprache4.naechster = sprache5;
		sprache5.naechster = sprache6;
		
		printLinkedList(sprache1);
		
	}
	
	
	// Anzeigen aller Elemente in der Linkedliste
	static void printLinkedList(Link<String> kopf) {
		Link<String> current = kopf;
		int position = 1;
		
		while(current != null) {
			System.out.println(position + ": " + current.daten);
			position++;
			current = current.naechster;
		}
	}
	
	// Anfügen von einem Link in der Mitte der Liste - Bsp: anfuegen("React", 3);
	static void anfuegen(Link<String> sprache, int position) {
		
	}
	
	// Entfernen von einem Link in der Mitte der Liste - Bsp: entfernen("React", 3);
	static void entfernen(Link<String> sprache, int position) {
		
	}
	
}
