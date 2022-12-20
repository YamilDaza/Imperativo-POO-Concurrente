import java.util.Scanner;

class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Autos auto1 = new Autos("Ford Ka", 0, 205.000);
      System.out.println(auto1.toString());

      String nombre, apellido;
      int edad, dni;
      System.out.print("Ingresa tu nombre: ");
      nombre = sc.nextLine();
      System.out.print("Ingresa tu apellido: ");
      apellido = sc.nextLine();
      System.out.print("Cual es tu edad: ");
      edad = sc.nextInt();
      System.out.print("Ingresa tu nro de DNI: ");
      dni = sc.nextInt();

      System.out.println("Bienvenido " + nombre + " " + apellido + ". Tu edad es: " + edad + " - Tu DNI: " + dni);

      sc.close();
   }
}