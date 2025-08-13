import Übungen.Link;

public class Altklausuren {

	public int laenge() {
		if(anfang == null) {
			return 0;
		}
		
		Link<T> aktuell = anfang;
		int zähler = 0;
		
		while(aktuell != null) {
			zähler++;
			aktuell = aktuell.naechster;
		}
		
		return zähler;
	}
	
	public Liste<T> teilen(){
		int n = laenge();
		
		if(n == 0) {
			return new Liste<T>();
		}
		
		int hälfte = (n+1) / 2;
		Link<T> aktuell = anfang;
		
		for(int i = 1; i < mitte; i++) {
			aktuell = current.naechster;
		}
		
		Liste<T> zweiteListe = new Liste<T>();
		zweiteListe.anfang = aktuell.naechster;
	}
	
	public Link<T> ende(){
		if(anfang == null) {
			return null;
		}
		
		Link<T> aktuell = anfang;
		
		while(aktuell.naechster != null) {
			aktuell = aktuell.naechster;
		}
		
		return aktuell;
	}
	
	public void verketten(Liste<T> zweiteListe) {
		assert(this != zweiteListe);
		
		if(zweiteListe.anfang == null) {
			return;
		}
		
		if(anfang == null) {
			anfang = zweiteListe;
		}
		
		Link<T> endeRef = ende();
		endeRef.naechster = zweiteListe.anfang;
		
		zweiteListe.anfang = null;
	}
	
	public void push(Auftrag a) {
		assert( a != null);
		
		Link<Auftrag> aktuell = oben;
		Link<Auftrag> vorher = null;
		
		while(aktuell != null) {
			if(aktuell.daten.equals(a)) {
				if(vorher == null) {
					oben = aktuell.naechster;
				} else {
					vorher.naechster = aktuell.naechster
				}
			}
			vorher = aktuell;
			aktuell = aktuell.naechster;
		}
		
		oben = new Link<>(a, oben);
	}
	
	public Auftrag pop() {
		if(oben == null) {
			return null;
		}
		
		Auftrag topAuftrag = oben.daten;
		oben = oben.naechster;
		return topAuftrag;
	}
	
	public Person dequeue() {
		assert(p != null);
		
		if(anfang == null) {
			return null;
		}
		
		Person p = anfang.daten;
		anfang = anfang.naechster;
		return p;
	}
	
	public void enqueue(Person p) {
		assert(p != null);
		
		Link<Person> aktuell = anfang;
		
		while(aktuell != null) {
			if(aktuell.daten.equals(p)) {
				return;
			}
			if(aktuell.naechster == null) {
				aktuell.naechster = new Link<>(p, null);
				return;
			}
			aktuell = aktuell.naechster;
		}
		return aktuell.naechster = p;
	}
	
	
}
