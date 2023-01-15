package Java.Task3;

public class Hotel {
   private Habitacion hotel[];
   private int dimF;

   public Hotel(int unaDimf){
      this.dimF = unaDimf;
      this.hotel = new Habitacion[dimF];
   }

   public int getDimF() {
      return dimF;
   }
   public void setDimF(int dimF) {
      this.dimF = dimF;
   }
}
