package Java.ClassAbstrac;

public class Entrenador extends Empleado {
   private int campeonatosGanados;

   public Entrenador(int campeonatosGanados, String nombre, int sueldoBasico, int antiguedad){
      super(nombre, sueldoBasico, antiguedad);
      setCampeonatosGanados(campeonatosGanados);
   }

   //Metodo SET
   public void setCampeonatosGanados(int campeonatosGanados) {
      this.campeonatosGanados = campeonatosGanados;
   }

   //Metodo GET
   public int getCampeonatosGanados() {
      return campeonatosGanados;
   }

   @Override
   public int calcularEfectividad() {
      return this.campeonatosGanados / this.getAntiguedad();
   }
   @Override
   public int calcularSueldoACobrar() {
      return (int) (this.getSueldoBasico() + ((this.getSueldoBasico() * 0.10) * this.getAntiguedad()));
   }
}
