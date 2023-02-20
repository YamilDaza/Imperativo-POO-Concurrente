package Java.Task6;

import java.util.Scanner;

public class Main {
   public static void main(String[] args){
      /* dimF 5: Cantidad de clientes a calificar 
         dimC 4: Las 4 categorias para calificar 
      */
      int dimF = 5, dimC = 4;
      int [][]clientes = new int[dimF][dimC];

      Scanner leer = new Scanner(System.in);
      for (int f = 0; f < dimF; f++) {
         System.out.println("Cliente nro " + (f+1) + ": ");
         for (int c = 0; c < dimC; c++) {
            System.out.print(" - Calificación a la categoria " + (c+1) + ": ");
            clientes[f][c] = leer.nextInt();
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
