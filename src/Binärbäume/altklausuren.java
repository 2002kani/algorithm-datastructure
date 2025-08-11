package Binärbäume;

public class altklausuren {
	
	// 11.08.2022 
	
	// a)
	private int hoehe(Knoten knoten) {
		if(knoten == null) {
			return 0;
		}
		
		int linkeHoehe = hoehe(knoten.links);
		int rechteHoehe = hoehe(knoten.rechts);
		
		return 1 + Math.max(linkeHoehe, rechteHoehe);
	}
	
	// b)
	private boolean istBlatt(Knoten knoten) {
		assert(knoten != null);
		
		return knoten.rechts == null && knoten.links == null;
	}
	
	// c)
	private int anzahlBlaetter(Knoten knoten) {
		if(knoten == null) {
			return 0;
		}
		
		if(istBlatt(knoten)) {
			return 1;
		}
		
		return anzahlBlaetter(knoten.links) + anzahlBlaetter(knoten.rechts);
	}
	
	// d)
	public boolean istVollständig() {
		keine ahnung lo
	}

	
	// 08.02.2023
	
	// a)
	private int minimum(Knoten knoten) {
		assert(knoten != null);
		
		if(knoten.links != null) {
			return minimum(knoten.links);
		}
		
		return knoten.schluessel;
	}
	
	// c)
	private boolean istSuchbaum(Knoten knoten) {
		if(knoten == null) {
			return true;
		}
		
		if(knoten.links != null) {
			if(maximum(knoten.links) >= knoten.schluessel) {
				return false;
			}
		}
		if(knoten.rechts != null) {
			if(minimum(knoten.rechts) < = knoten.schluessel) {
				return false;
			}
		}
		
		return istSuchbaum(knoten.links) && istSuchbaum(knoten.rechts);
	}
	
	
	// 02.08.2023

	// a)
	private int maximum() {
		if(wurzel == null) {
			return -1;
		}
		
		Knoten aktuell = wurzel;
		
		while(aktuell != null) {
			aktuell = aktuell.rechts;
		}
		
		return aktuell.schluessel;
	}
	
	// b)
	public int istAVL(Knoten knoten) {
		if(knoten == null) {
			return 0;
		}
		
		int rechteHöhe = istAVL(knoten.rechts);
		if(rechteHöhe == -1) {
			return -1;
		}
		
		int linkeHöhe = istAVL(knoten.links);
		if(linkeHöhe == -1) {
			return -1;
		}
		
		if(Math.abs(linkeHöhe - rechteHöhe) -1) {
			return -1;
		}
		
		return Math.max(rechteHöhe, linkeHöhe) +1;
	}
	
	
	
	
	
	
	
	
}
