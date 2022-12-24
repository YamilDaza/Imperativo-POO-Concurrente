package Java.Task2;

public class Trabajador extends Persona {
   private String labor;

   public Trabajador(String unNombre, int unDni, int unaEdad, String unLabor){
      super(unNombre,unDni,unaEdad);
      this.labor = unLabor;
   }

   public String toString() {
      String aux = super.toString() + " Soy " + getLabor();
      return aux;
   }

   //Metodo Get y Set - Labor
   public String getLabor() {
      return labor;
   }
   public void setLabor(String labor) {
      this.labor = labor;
   }
   
}
