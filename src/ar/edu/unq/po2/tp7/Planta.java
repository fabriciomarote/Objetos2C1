package ar.edu.unq.po2.tp7;

public class Planta extends Empleado{
    
	private Integer cantDeHijos;
	
	@Override
	protected Double sueldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double sueldoBasico() {
		return 3000d;
	}
	
	@Override
	public Double plus() {
		return this.cantDeHijos * 150d;
	}

}
