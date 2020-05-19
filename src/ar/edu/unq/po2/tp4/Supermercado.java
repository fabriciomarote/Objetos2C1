package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
    private String nombre;
    private String direccion;
    private ArrayList<Producto> catalogo; 

    public Supermercado(String unNombre, String unaDireccion) {
    	this.nombre = unNombre;
		this.direccion = unaDireccion;
		this.catalogo = new ArrayList<Producto>();		
	}

	public String getNombre() {
    	return nombre;
    }
	
    public String getDireccion() {
    	return direccion;
    }
    
    public Integer cantDeProductos() {
    	return catalogo.size();
    }
    
    public void agregarProducto(Producto unProducto ) {
    	catalogo.add(unProducto);
    }
    
    public Integer getCantidadDeProductos() {
    	return catalogo.size();
    }
    
    public Double getPrecioTotal() {
    	Double  total = 0.0;
    	for (Producto producto:catalogo){
    		total = total + producto.getPrecio();
    	}
    	return total;
    }
    
    public Double getPrecioTotal2() {
		Double precioTotal = catalogo.stream().mapToDouble(p->p.getPrecio()).sum();
		return  precioTotal;
	   // Otra forma de encarar
	}
}