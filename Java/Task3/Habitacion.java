package Java.Task3;

public class Habitacion {
   private int costo;
   private boolean disponible;
   private Cliente cliente;

   public Habitacion(int unCosto){
      this.costo = unCosto;
      this.disponible = false;
   }

   //Metodos GET
   public int getCosto() {
      return costo;
   }
   public boolean getDisponible() {
      return disponible;
   }
   public Cliente getCliente() {
      return cliente;
   }

   public void setCosto(int costo) {
      this.costo = costo;
   }
   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }
   public void setDisponible(boolean disponible) {
      this.disponible = disponible;
   }

}
