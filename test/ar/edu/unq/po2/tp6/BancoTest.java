package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

	private Banco banco;
	private Cliente cliente1;
	private Cliente cliente2;
	private Cliente cliente3;
	private Cliente cliente4;
	private SolicitudDeCredito creditoHipotecario;
	private SolicitudDeCredito creditoPersonal;
	private List<Cliente> clientes;
	
	@BeforeEach
	public void setUp() {
		banco = new Banco();
		cliente1= new Cliente("Pepa","Martinez","direccion 123", 81, 60000d);
		cliente2= new Cliente("Pepe","Gonzalez","direccion 1234", 80, 35000d);
		cliente3= new Cliente("Pepo","Perez","direccion 12345", 31, 69000d);
		cliente4= new Cliente("Pepu","Lopez","direccion 123456", 18, 50000d);	
		
		banco.agregarCliente(cliente1);
		banco.agregarCliente(cliente2);
		banco.agregarCliente(cliente3);
		
		creditoHipotecario = new CreditoHipotecario(cliente1, 20000D, 10, null);
		creditoPersonal = new CreditoPersonal(cliente2, 0d, 12);
		banco.registrar(creditoHipotecario);
		banco.registrar(creditoPersonal);
			
		clientes = new ArrayList<Cliente>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
