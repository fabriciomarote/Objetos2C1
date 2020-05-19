package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
     private List<Cliente> clientes;
     private List<SolicitudDeCredito> solicitudes;
     private Double montoTotalADesembolzar;

	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
		this.montoTotalADesembolzar = 0d;    /// consultar
	}
     
    public List<Cliente> getClientes() {
    	return clientes;
    }
    
    public List<SolicitudDeCredito> getSolicitudes() {
    	return solicitudes;
    }
    
    public Double getMontoTotalADesembolzar() {
		return montoTotalADesembolzar;
	}

    public void agregarCliente(Cliente cliente) {
    	clientes.add(cliente);
    }
    
    public void registrar(SolicitudDeCredito solicitud) {
    	 solicitudes.add(solicitud);
    }
    
    public void evaluar(SolicitudDeCredito solicitud) {
    	solicitud.realizarChequeo();
    	this.desembolsarCredito(solicitud.getCliente());
    }
    
    private void desembolsarCredito(Cliente cliente) {
		 cliente.cobrarCredito();   ////Consultar por el monto
	}
    
    public void otorgarCredito(SolicitudDeCredito credito) {
		 credito.realizarChequeo();
			
	}
    
}