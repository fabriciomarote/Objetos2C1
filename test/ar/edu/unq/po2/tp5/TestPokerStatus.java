package ar.edu.unq.po2.tp5;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.Carta;
import ar.edu.unq.po2.tp8.PokerStatus;

class TestPokerStatus {

	private PokerStatus poker;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private Carta carta6;
	
	@Before
	public void setUp(){
		// setUp
		poker = new PokerStatus();
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
		carta6 = mock(Carta.class);
	}
	
	@Test
	void testVerificar() {
		//Test Double Configuration
		when(poker.hayPoker(carta1, carta2, carta3, carta4, carta5)).thenReturn(true);
		
		//Exercise
		poker.verificar("5P","5D","5Q","5T","QD");
		
		//Verify
		verify(poker).verificar("5P","5D","5Q","5T","QD");
	}
	
	@Test
	void testNotVerificar() {
		//Test Double Configuration
		when(poker.verificar("2P","7D","7Q","7T","1D")).thenReturn(false);
		
		//Exercise
		poker.verificar("2P","7D","7Q","7T","1D");	
	}

	    //Verify
}
