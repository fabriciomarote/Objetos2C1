package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{

	private Double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean precioCuidado,Double descuento) {
		super(nombre, precio, precioCuidado);
		this.setDescuento(descuento);
	}

	@Override
	public Double getPrecio() {
		return this.getPrecio() * this.getDescuento();
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
}