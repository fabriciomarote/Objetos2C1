package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Individuo {
   
	private String nombre;
	private LocalDate fechaDeNacimiento;

	public Individuo(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String setNombre(String unNombre) {
		return nombre = unNombre;
	}
	
	public LocalDate getFecha() {
		return fechaDeNacimiento;
	}
	
	public int edad() {
		LocalDate hoy = LocalDate.now();
		return Period.between(this.getFecha(),hoy).getYears();
	}
	
	public Boolean menorQue(Individuo individuo) {
	  return this.edad() < individuo.edad();
	}
}