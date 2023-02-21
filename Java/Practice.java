package Java;

import java.util.Scanner;

public class Practice{
   private String name;
   private int dni;
   private int age;

   //Constructror sin parametros
   public Practice(){};

   //Constructor con parametros
   public Practice(String name, int dni, int age){
      this.name = name;
      this.dni = dni;
      this.age = age;
   };

   //Método GET
   public String getName() {
      return name;
   }
   public int getDni() {
      return dni;
   }public int getAge() {
      return age;
   }

   //Método SET
   public void setName(String name) {
      this.name = name;
   }
   public void setDni(int dni) {
      this.dni = dni;
   }
   public void setAge(int age) {
      this.age = age;
   }

   public String toString(){
      String aux = "Hi, my name is " + getName() + ", my dni is " + getDni() + " and have " + getAge() + " years.";
      return aux;
   }


   public static void main(String[] args){
      int dimF = 15;
      int dimL = 0;
      Practice []users = new Practice[dimF];

      Scanner read = new Scanner(System.in);
      String name;
      int dni, age;

      System.out.print("Enter your name: ");
      name = read.nextLine();
      
      System.out.print("- DNI: ");
      dni = read.nextInt();

      System.out.print("- Age: ");
      age = read.nextInt();

      while((dimL < dimF) && (age != 0)){
         users[dimL] = new Practice(name, dni, age);
         dimL++;

         System.out.println();
         System.out.print("Enter your name: ");
         name = read.nextLine();
   
         System.out.print("- DNI: ");
         dni = read.nextInt();

         System.out.print("- Age: ");
         age = read.nextInt();
      }

      if(dimL > 0){
         System.out.println("The number of added users is " + dimL);
      }else{
         System.out.println("No user added");
      }

      read.close();


   }
}
