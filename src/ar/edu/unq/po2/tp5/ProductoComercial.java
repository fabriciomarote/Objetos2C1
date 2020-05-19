package ar.edu.unq.po2.tp5;

public abstract class ProductoComercial implements Producto {
    
	protected Double precio;
    
    public ProductoComercial(Double p) {
    	this.precio = p;
    }
    
    public Double getPrecio() {
    	return precio;
    }
    
    public void setPrecio(Double d) {
    	this.precio = d;
    }
    
    public void registrarEn(Agencia agencia) {
  
    }
   
    abstract public Double getPrecioTotal();         
}