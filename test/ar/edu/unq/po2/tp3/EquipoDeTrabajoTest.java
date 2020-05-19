package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {

	private EquipoDeTrabajo equipoDeTrabajo;
	
	private Persona persona1;
	private Persona persona2; 
	private Persona persona3; 
	private Persona persona4; 
	private Persona persona5; 
	

	@BeforeEach
	 void setUp() throws Exception {
		
		equipoDeTrabajo = new EquipoDeTrabajo("nombre");
		
		persona1 = new Persona("Maria", "Fernandez", 30 );
		persona2 = new Persona("Jose", "Peralta", 25);
		persona3 = new Persona("Pedro", "Sosa", 30);
		persona4 = new Persona("Ana", "Gonzalez", 35); 
		persona5 = new Persona("Patricia", "Perez", 20);
		
		// Agrego al ArrayList 5 personas
		
		equipoDeTrabajo.agregarIntegrante(persona1);
		equipoDeTrabajo.agregarIntegrante(persona2);
		equipoDeTrabajo.agregarIntegrante(persona3);
		equipoDeTrabajo.agregarIntegrante(persona4);
		equipoDeTrabajo.agregarIntegrante(persona5);
	}

	@Test
	void testpromedioEdadDeIntegrantes() {
		assertEquals(28, equipoDeTrabajo.promedioEdadDeIntegrantes());
	}
}