package Java.Task6;

import java.util.Scanner;

public class Main {
   public static void main(String[] args){
      /* dimF 5: Cantidad de clientes a calificar 
         dimC 4: Las 4 categorias para calificar 
      */
      int dimF = 5, dimC = 4;
      int [][]clientes = new int[dimF][dimC];
      String []categorias = new String[4];

      categorias[0] = "Atencion al Cliente";
      categorias[1] = "Calidad de la comida";
      categorias[2] = "Precio";
      categorias[3] = "Ambiente";

      System.out.println("Categorias: ");
      for (int i = 0; i < categorias.length; i++) {
         System.out.println((i+1) + "- " + categorias[i]);
      }

      try (Scanner leer = new Scanner(System.in)) {
         for (int f = 0; f < dimF; f++) {
            System.out.println("Cliente nro " + (f+1) + ": ");
            for (int c = 0; c < dimC; c++) {
               System.out.print(" - Calificación a la categoria " + (c+1) + ": ");
               clientes[f][c] = leer.nextInt();
            }
         }
      }
      for (int f = 0; f < dimF; f++) {
         System.out.print("Cliente nro " + (f+1) + "-> ");
         for (int c = 0; c < dimC; c++) {
            System.out.print("  Aspecto " + (c+1) + ": " + clientes[f][c] + "   |");
         }
         System.out.println();
      }

   }
}
