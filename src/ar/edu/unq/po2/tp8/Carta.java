package ar.edu.unq.po2.tp8;

public class Carta {
      
	private String valor;
	private String palo;
	
	public Carta(String valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public String getValor() {
		return valor;
	}
	
	public String getPalo() {
		return palo;
	}
	
	public Boolean esMayorQue(Carta otraCarta) {
		return this.getValor() > otraCarta.getValor();
	}
	
	public Boolean mismoPaloQue(Carta otraCarta) {
		return this.getPalo() == otraCarta.getPalo();
	}
}