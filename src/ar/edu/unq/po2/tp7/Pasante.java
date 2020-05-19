package ar.edu.unq.po2.tp7;

public class Pasante extends Empleado{

	private Integer cantHorasDelMes;

	@Override
	protected Double sueldo() {
		return this.cantHorasDelMes * 40d;
	}

	@Override
	public Double sueldoBasico() {
		return null;
	}

	@Override
	public Double plus() {
		return null;
	}
}