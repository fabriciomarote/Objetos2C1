package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso{
	private Integer cantDeHorasExtras;
	
    public IngresoPorHorasExtras(Integer mes, String concepto, Double monto, Integer cantHoras) {
		super(mes, concepto, monto);
		this.cantDeHorasExtras = cantHoras;
	}

    public int getCantDeHorasExtras() {
    	return cantDeHorasExtras;
    }

	@Override
	public Double getMontoImponible() {
		return 0d;
	}
}