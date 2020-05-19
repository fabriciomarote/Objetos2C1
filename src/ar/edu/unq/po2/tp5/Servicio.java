package ar.edu.unq.po2.tp5;

public class Servicio extends Factura{
	
   private Double costoPorUnidadConsumida;
   private Integer cantUnidadesConsumidas;
   
   public Servicio(Double d, Integer i) {
	   this.costoPorUnidadConsumida = d;
	   this.cantUnidadesConsumidas = i;
   }
   
   public Double getCostoPorUnidadConsumida() {
       return costoPorUnidadConsumida;	   
   }
   
   public int getCantUnidadesConsumidas() {
	   return cantUnidadesConsumidas;
   }

   @Override
   public Double getPrecioTotal() {
	   return this.costoPorUnidadConsumida * this.cantUnidadesConsumidas;
   }
}