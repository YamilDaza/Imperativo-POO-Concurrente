package Java.Task2;

public class Main {
   public static void main(String[] args){
      Persona peopleOne = new Persona("Yamil", 94120040, 24);
      Trabajador employeeOne = new Trabajador("Juan", 41238180, 42, "Jardinero");

      System.out.println("Información de ambas instancias: ");
      System.out.println("Instancia Persona -> " + peopleOne.toString());
      System.out.println("Instancia Trabajador -> " + employeeOne.toString());
   }
}
