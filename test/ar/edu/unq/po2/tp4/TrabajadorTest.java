package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {
	
	private Trabajador trabajador;
	private IngresoImponible ingresoImponible;
	private IngresoPorHorasExtras ingresoPorHoraExtra;
	
	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador();
		ingresoImponible = new IngresoImponible(3,"Sueldo", 30000d);
		ingresoPorHoraExtra = new IngresoPorHorasExtras(3, "Sueldo", 10000d, 10);
		trabajador.agregarIngreso(ingresoImponible);
		trabajador.agregarIngreso(ingresoPorHoraExtra);		
	}
	
	@Test 
	public void verificaElMontoTotalPercibidoPorElTrabajador() {
		assertEquals(30000,trabajador.getTotalPercibido());	
	}
	
	@Test
	public void verificaElMontoImponible() {
		assertEquals(30000,trabajador.getMontoImponible());
	}
	
	@Test
	public void verificaElValorDeLosImpuestosaPagar() {
		assertEquals(600,trabajador.getImpuestoAPagar());
	}
}