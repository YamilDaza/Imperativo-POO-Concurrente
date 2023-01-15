package Java.Task3;

public class Cliente {
   private String nombre;
   private int dni;
   private int edad;

   public Cliente(String unNombre, int unDni, int unaEdad){
      this.nombre = unNombre;
      this.dni = unDni;
      this.edad = unaEdad;
   }

   // Metodos GET
   public String getNombre() {
      return nombre;
   }
   public int getDni() {
      return dni;
   }
   public int getEdad() {
      return edad;
   }

   // Metodos SET
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   public void setDni(int dni) {
      this.dni = dni;
   }
   public void setEdad(int edad) {
      this.edad = edad;
   }
}