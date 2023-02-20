package Java.Task5;

public class Persona {
   private int nroPiso;
   private int nroOficina;

   public Persona(int nroPiso, int nroOficina){
      this.nroPiso = nroPiso;
      this.nroOficina = nroOficina;
   }

   public int getNroPiso() {
      return nroPiso;
   }
   public int getNroOficina() {
      return nroOficina;
   }

   public String toString() {
      String aux = "Hi, Asistent in piso " + getNroPiso() + " Office " + getNroOficina() + ".";
      return aux;
   }
}
