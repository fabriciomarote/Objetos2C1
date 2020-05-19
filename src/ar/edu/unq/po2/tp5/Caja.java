package ar.edu.unq.po2.tp5;

public class Caja {
	
	private Double montoAPagar;
    private Agencia agencia;
    private Stock stock;
    
    public Caja(Agencia a,Stock s) {
    	this.montoAPagar = 0d;
    	this.agencia = a;
    	this.stock = s;
    }
    
    public Double getMontoAPagar() {
    	return montoAPagar;
    }
    
    public Agencia getAgencia() {
    	return agencia;
    }
    
    public Stock getStock() {
    	return stock;
    }

    public void registrar(Producto producto) {    	    
    	this.montoAPagar += producto.getPrecioTotal();    
    	stock.descontarStock(producto);
    	producto.registrarEn(agencia);	
    }
}