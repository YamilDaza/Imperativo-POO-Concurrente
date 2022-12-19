public class Autos {
   private String marcaYmodelo;
   private int km;
   private double precio;

   public Autos(String marcaYmodelo, int km, double precio){
      this.marcaYmodelo = marcaYmodelo;
      this.km = km;
      this.precio = precio;
   }

   /* Metodo get */
   public String getMarcaYmodelo(){
      return marcaYmodelo;
   }
   public int getKm(){
      return km;
   }
   public double getPrecio(){
      return precio;
   }

   /* Metodos set */
   public void setMarcaYmodelo(String marcaYmodelo) {
      this.marcaYmodelo = marcaYmodelo;
   }
   public void setKm(int km) {
      this.km = km;
   }
   public void setPrecio(double precio) {
      this.precio = precio;
   }

   public String toString() {
      String aux = "Auto: " + getMarcaYmodelo() + " - KM: " + getKm() + " - Precio: $" + getPrecio();
      return aux;
   }

}
