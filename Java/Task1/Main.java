import java.util.Scanner;

class Main{
   public static void main(String[] args){
      Scanner escaner = new Scanner(System.in);
      Autos auto1 = new Autos("Ford Ka", 0, 205.000);
      System.out.println(auto1.toString());
      escaner.close();
   }
}