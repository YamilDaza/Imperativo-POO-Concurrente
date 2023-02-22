package Java.ClassAbstrac;

public abstract class Empleado {
   private String nombre;
   private int sueldoBasico;
   private int antiguedad;

   public Empleado(String nombre, int sueldoBasico, int antiguedad){
      setNombre(nombre);
      setSueldoBasico(sueldoBasico);
      setAntiguedad(antiguedad);
   }

   //Metodos SET
   public void setNombre(String nombre){
      this.nombre = nombre;
   }
   public void setSueldoBasico(int sueldoBasico){
      this.sueldoBasico = sueldoBasico;
   }
   public void setAntiguedad(int antiguedad) {
      this.antiguedad = antiguedad;
   }

   //Metodo GET
   public String getNombre() {
      return nombre;
   }
   public int getSueldoBasico() {
      return sueldoBasico;
   }
   public int getAntiguedad() {
      return antiguedad;
   }

   //Metodo abstractos
   public abstract int calcularEfectividad();
   public abstract int calcularSueldoACobrar();

}
