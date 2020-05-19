package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {

	private Agencia agencia;
	
	private Stock stock;
	private Caja caja1;
	private Caja caja2;
	private Producto azucar;
	private Producto pan;
	private Producto pancho;
	private Producto leche;
	private Producto papel;
	private Producto facturaGas;
	private Producto impuesto;

	@BeforeEach
	public void setUp() {
		
		stock= new Stock();
		caja1 = new Caja(agencia,stock);
		azucar = new ProductoTradicional(55d);
		pan = new ProductoTradicional(30d);
		leche = new ProductoTradicional(50d);
		pancho = new ProductoCooperativa(100d);
		papel = new ProductoCooperativa(55d);
		facturaGas = new Servicio(30d, 400);
		impuesto = new Impuesto(50d);
		stock.agregarProducto(leche, 3);
		stock.agregarProducto(azucar,10);
		stock.agregarProducto(pan, 2);
		stock.agregarProducto(pancho, 12);
		stock.agregarProducto(papel, 3);
	}
	
	@Test
	void testStock() {
		caja1.registrar(leche);
		caja1.registrar(leche);
		caja1.registrar(leche);
		caja1.registrar(azucar);
		caja1.registrar(pan);
		caja1.registrar(pan);
		assertEquals(0,stock.stockDe(leche));
		assertEquals(9,stock.stockDe(azucar));
		assertEquals(0,stock.stockDe(pan));
	}
	
	@Test
	public void stockVariasCajas() {
		caja2 = new Caja(agencia,stock);
		caja1.registrar(leche);
		caja2.registrar(leche);
		caja1.registrar(leche);
		caja2.registrar(azucar);
		caja1.registrar(pan);
		caja2.registrar(pan);
		assertEquals(0,stock.stockDe(leche));
		assertEquals(9,stock.stockDe(azucar));
		assertEquals(0,stock.stockDe(pan));					
	}
}