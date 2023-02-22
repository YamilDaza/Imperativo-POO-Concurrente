package Java.ClassAbstrac;

public class Jugador extends Empleado {
   private int partidosJugados;
   private int golesAnotados;

   public Jugador(int partidosJugados, int golesAnotados, String nombre, int sueldoBasico, int antiguedad){
      super(nombre, sueldoBasico, antiguedad);
      setPartidosJugados(partidosJugados);
      setGolesAnotados(golesAnotados);
   }

   //Metodos SET
   public void setPartidosJugados(int partidosJugados) {
      this.partidosJugados = partidosJugados;
   }
   public void setGolesAnotados(int golesAnotados) {
      this.golesAnotados = golesAnotados;
   }

   //Metodos GET
   public int getPartidosJugados() {
      return partidosJugados;
   }
   public int getGolesAnotados() {
      return golesAnotados;
   }

   @Override
   public int calcularEfectividad() {
      return this.golesAnotados / this.partidosJugados;
   }
   @Override
   public int calcularSueldoACobrar() {
      return (int) (this.getSueldoBasico() + ((this.getSueldoBasico() * 0.10) * this.getAntiguedad()));
   }

}
