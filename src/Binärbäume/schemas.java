package Binärbäume;

public class schemas {
	
	// Rekursiv Minimum finden
	public int minimum(Node knoten) {
		assert(knoten != null);
		
		if(knoten.left != null) {
			return minimum(knoten.left);
		}
		
		return knoten.key;
	}
	
	
	// Rekursiv Maximum finden
	public int maximum(Node knoten) {
		assert(knoten != null);
		
		if(knoten.right != null) {
			return maximum(knoten.right);
		}
		
		return knoten.key; 
	}
	
	
	// Prüfen ob ein Knoten ein Blatt ist
	public boolean istBlatt(Node knoten) {
		assert(knoten != null);
		
		return knoten.left == null && knoten.right == null;
	}
	
	
	// Anzahl der Blätter zählen
	public int anzahlBlätter(Node knoten) {
		assert(knoten != null);
		
		if(knoten.left == null && knoten.right == null) {
			return 1;
		}
		
		return anzahlBlätter(knoten.left) + anzahlBlätter(knoten.right);
	}
	
	
	// Prüfen ob es sich um ein Suchbaum handelt
	public boolean istSuchbaum(Node knoten, int min, int max) {
	    if (knoten == null) {
	        return true;
	    }
	    if (knoten.key <= min || knoten.key >= max) {
	        return false;
	    }
	    return istSuchbaum(knoten.left, min, knoten.key)
	        && istSuchbaum(knoten.right, knoten.key, max);
	}
	
	
	// Iterativ Maximum / Minimum finden
	public int maximumIterativ(Node knoten) {
		assert(knoten != null);
		
		Node aktuell = knoten;
		
		while(aktuell.right != null) {
			aktuell = aktuell.right;
		}
		
		return aktuell.key;
	}
	
	
	// Höhe eines Binärbaums herausfinden (rekursiv)
	public int hoehe(Node knoten) {
		if(knoten == null) {
			return 0;
		}
		
		int hoeheLinks = hoehe(knoten.left);
		int hoeheRechts = hoehe(knoten.right);
		
		return 1 + Math.max(hoeheLinks, hoeheRechts);
	}
	
	
	// AVL Bestimmen
	public int istAVL(Node knoten) {
		if(knoten != null) {
			return 0;
		}
		
		int linkeHöhe = istAVL(knoten.left);
		if(linkeHöhe == -1) {
			return -1;
		}
		
		int rechteHöhe = istAVL(knoten.right);
		if(rechteHöhe == -1) {
			return -1;
		}
		
		if(Math.abs(linkeHöhe - rechteHöhe) > 1) {
			return -1;
		}
		
		return Math.max(linkeHöhe, rechteHöhe) + 1;
	}
	
	
	// Degenerativen Baum bestimmen
	public boolean istLineareListe() {
		if(wurzel == null) {
			return false;
		}
		
		Node aktuell = wurzel;
		
		while(aktuell != null) {
			if(aktuell.left != null && aktuell.right != null) {
				return false;
			}
			aktuell = (aktuell.left != null) ? aktuell.left : aktuell.right;
		}
		
		return true;
	}
	

	// Binärbaum absteigend Sammeln und mit leerzeichen zwischenspeichern
	public String absteigend(Node k) {
		if(k == null) {
			return "";
		}
		
		String rechts = absteigend(k.right);
		String aktuell = k.key + " ";
		String links = absteigend(k.left);
		
		return rechts + aktuell + k.left;
	}
	
	
	// Iterativ im Suchbaum suchen
	public boolean suchenIter(int wert) {
		Node aktuell = wurzel;
		
		while(aktuell != null) {
			if(wert == aktuell.key) {
				return true;
			}
			else if(wert < aktuell.key) {
				aktuell = aktuell.left;
			} else if(wert > aktuell.key) {
				aktuell = aktuell.right;
			}
		}
		return false;
	}
	
	
	// Iterativ im AVL Baum suchen
	public boolean suchenAVL(int wert) {
		Node aktuell = wurzel;
		
		while(aktuell != null) {
			if(aktuell.key == wert) {
				return true;
			} else if(aktuell.key > wert) {
				aktuell = aktuell.left;
			} else if(aktuell.key < wert) {
				aktuell = aktuell.right;
			}
		}
		return false;
	}
}
