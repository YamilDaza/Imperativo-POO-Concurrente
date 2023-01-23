package Java.Task3;

public class Concesionaria {
   private String name;
   private String address;
   private int dimF;
   private Car cars[];

   public Concesionaria(String name, String address, int dimf){
      this.name = name;
      this.address = address;
      this.dimF = dimf;

      this.cars = new Car[dimf];
   }

   public String getName() {
      return name;
   }
   public String getAddress() {
      return address;
   }
   public int getDimF() {
      return dimF;
   }
   public Car[] getCars() {
      return cars;
   }
}
