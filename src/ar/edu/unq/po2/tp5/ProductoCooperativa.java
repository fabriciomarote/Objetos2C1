package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends ProductoComercial{
    
	public ProductoCooperativa(double p) {
		super(p);
	}
    
	@Override
	public Double getPrecioTotal() {
		Double importeADescontar = this.getPrecio() * 0.1;
		
		return this.getPrecio()- importeADescontar;
	}
}
