package ar.edu.unq.po2.tp7;

public class Temporario extends Empleado{

	private Integer horasTrabajadas;
	
	@Override
	protected Double sueldo() {
	  return  this.horasTrabajadas * 5 
			  + this.sueldoBasico()
			  + this.plus();
	}

	@Override
	public Double sueldoBasico() {
		return 1000d;
	}
	
	@Override
	public Double plus() {
		if( this.poseeHijos() || this.esCasado()) {
			 return 100d; 
		}
		else {
		     return 0d;
		}
	}
}
