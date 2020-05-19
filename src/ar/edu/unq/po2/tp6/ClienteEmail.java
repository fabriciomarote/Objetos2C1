package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class ClienteEmail {

	 private ServidorPop servidor;
	 private String nombreUsuario;
	 private String passusuario;
	 private ArrayList<Correo> inbox;
	 private ArrayList<Correo> borrados;

	 public ClienteEmail(ServidorPop servidor, String nombreUsuario, String pass){
		 this.servidor=servidor;
		 this.nombreUsuario=nombreUsuario;
		 this.passusuario=pass;
		 this.inbox = new ArrayList<Correo>();
		 this.borrados = new ArrayList<Correo>();
		 this.conectar();
     }
	 
	 public ServidorPop getServidor() {
	     return servidor;
	 }

	 public String getNombreUsuario() {
		 return nombreUsuario;
	 }

	 public String getPassusuario() {
	  	 return passusuario;
     }

	 public ArrayList<Correo> getInbox() {
		 return inbox;
	 }

	 public ArrayList<Correo> getBorrados() {
	  	 return borrados;
	 }
		
	 public void conectar(){
	  	 this.servidor.conectar(this.nombreUsuario,this.passusuario);
	 }
		
	public void borrarCorreo(Correo correo){
		 this.inbox.remove(correo);
		 this.borrados.remove(correo);
	}
		
	public int contarBorrados(){
		 return this.borrados.size();
	}
		
	public int contarInbox(){
		 return this.inbox.size();
	}
		
	public void eliminarBorrado(Correo correo){
		 this.borrados.remove(correo);
	}
		
	public void recibirNuevos(){
		 this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
		
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		 Correo correo = new Correo(asunto, destinatario, cuerpo);
		 this.servidor.enviar(correo);
	}
}