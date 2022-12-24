package Java.Task2;

public class Persona {
   private String nombre;
   private int dni;
   private int edad;

   public Persona(String unNombre, int unDni, int unaEdad){
      this.nombre = unNombre;
      this.dni = unDni;
      this.edad = unaEdad;
   }

   public String toString() {
      String aux = "Mi nombre es " + getNombre() + ", mi DNI es " + getDni() + " y tengo " + getEdad() + "años.";
      return aux;
   }

   //Metodo Get y Set - Nombre
   public String getNombre() {
      return nombre;
   }
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   //Metodo Get y Set - DNI
   public int getDni() {
      return dni;
   }
   public void setDni(int dni) {
      this.dni = dni;
   }

   //Metodo Get y Set - Edad
   public int getEdad() {
      return edad;
   }
   public void setEdad(int edad) {
      this.edad = edad;
   }


}
