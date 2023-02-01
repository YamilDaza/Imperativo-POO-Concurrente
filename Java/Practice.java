package Java;

public class Practice {
   public static void main(String[] args){
      /* for(int i = 1; i < 10; i++){
         System.out.println("Numero " + i);
      } */ 

      /* Creación de arreglos: */
      /*  int [] posiciones;
      posiciones = new int[7];
      for (int i = 0; i < posiciones.length; i++) {
         posiciones[i] = i + 2;
      }
      for (int i = 0; i < posiciones.length; i++) {
         System.out.println(posiciones[i]);
      } */


      //Matrices
      int [][]tabla = new int[2][3];

      for (int f = 0; f < 2; f++) {
         for (int c = 0; c < 3; c++) {
            tabla[f][c] = c + f;
         }
      }

      for (int f = 0; f < 2; f++) {
         System.out.print("FILA " + (f+1) + ": ");
         for (int c = 0; c < 3; c++) {
            System.out.print(tabla[f][c] + " | ");
         }
         System.out.println();
      }


   }
}
