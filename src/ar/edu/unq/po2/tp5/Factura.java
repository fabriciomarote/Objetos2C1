package ar.edu.unq.po2.tp5;

public abstract class Factura implements Producto {
    
	@Override
	public void registrarEn(Agencia agencia) {
		agencia.registrarPago(this);
	}
}
