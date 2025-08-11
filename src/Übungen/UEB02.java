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
		
		System.out.println("Nach der Methode (einfügen): ");
		printLinkedList(sprache1);
		
		System.out.println("");
		sprache1 = entfernen(sprache1, 3);
		
		System.out.println("Nach der Methode (entfernen): ");
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
	
	
	static Link<String> inMitteEinfügen(Link<String> anfang, String daten, int position){
		if(position <= 1 || anfang == null) {
			return new Link<String>(daten, anfang);
		}
		
		Link<String> aktuell = anfang;
		int zähler = 1;
		
		while(aktuell != null && zähler <= position - 1) {
			aktuell = aktuell.naechster;
			zähler++;
		}
		
		Link<String> neuesEnde = new Link<String>(daten, aktuell.naechster);
		aktuell.naechster = neuesEnde;
		
		return anfang;
	}
	
	
	
	
	
	// Einfügen von einem Link am Anfang der Liste 
	static Link<String> einfügenAmAnfang(Link<String> alterAnfang, String daten) {
		return new Link<String>(daten, alterAnfang);
	}	
	
	
	// Anfügen von einem Link in der Mitte der Liste (mit anfang)
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
	
	
	// Entfernen von einen Knoten irgendwo (mit anfang)
	static Link<String> entfernen(Link<String> anfang, int position) {
		if(anfang == null) {
			return null;
		}
		
		if(position <= 1) {
			return anfang.naechster;
		}
		
		Link<String> aktuell = anfang;
		int zähler = 1;
		
		while(aktuell.naechster != null && zähler < position - 1) {
			aktuell = aktuell.naechster;
			zähler++;
		}
		
		if(aktuell.naechster == null) {
			return anfang;
		}
		
		aktuell.naechster = aktuell.naechster.naechster;
		
		return anfang;
	}
}



