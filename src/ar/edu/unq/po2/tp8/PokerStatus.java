package ar.edu.unq.po2.tp8;

public class PokerStatus {

	public PokerStatus() {
	}
	
	public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		if(this.hayPoker(c1,c2,c3,c4,c5)) {
			return "poker";
		}
		else if (this.hayColor(c1,c2,c3,c4,c5)) {
			return "Color";
		}
		else if(this.hayTrio(c1,c2,c3,c4,c5)){
			return "Trio";
		}
		else {
			return "Nada";
		}
	}
	
	public Boolean hayPoker(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
	}
	
	public Boolean hayColor(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
	}
	
	public Boolean hayTrio(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
	}
	
}