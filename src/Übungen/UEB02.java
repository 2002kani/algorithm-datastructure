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
		
		System.out.println("Vor der Methode: ");
		printLinkedList(sprache1);
		
		System.out.println("");
		sprache1 = anfuegen(sprache1, "- REACT -", 3);
		
		System.out.println("Nach der Methode: ");
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
		
	// Einfügen von einem Link am Anfang der Liste 
	static Link<String> einfügenAmAnfang(Link<String> alterAnfang, String daten) {
		return new Link<String>(daten, alterAnfang);
	}	
	
	// Anfügen von einem Link in der Mitte der Liste (mit hilfe) - Bsp: anfuegen(Anfang, "React", 3);
	static Link<String> anfuegen(Link<String> anfang, String daten, int position) {
		if(position <= 0 || anfang == null) {
			return new Link<String>(daten, anfang);
		}
		
		Link<String> current = anfang;
		int counter = 1;
		
		while(current != null && counter != position -1) {
			current = current.naechster;
			counter++;
		}
		
		// Falls Position die Links überschreitet
		if(current == null) {
			return anfang;
		}
		
		Link<String> neuerKnoten = new Link<String>(daten, current.naechster);
		current.naechster = neuerKnoten;
		
		return anfang;
	}
	
	// Entfernen von einem Link in der Mitte der Liste - Bsp: entfernen("React", 3);
	static void entfernen(Link<String> sprache, int position) {
		
	}
	
}
