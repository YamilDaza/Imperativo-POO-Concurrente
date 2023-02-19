package Java.Task4;

public class Main {
   public static void main(String[] args) {
      int dimF = 5, dimC = 5;
      int [][] matriz = new int[dimF][dimC];

      // Cargar numero aleatorios a la matriz
      for (int f = 0; f < dimF; f++) {
         for (int c = 0; c < dimC; c++) {
            matriz[f][c] = (int)(Math.random() * 100);
         }
      }

      //Imprimir datos de la matriz
      for (int f = 0; f < dimF; f++) {
         System.out.print("Fila " + (f+1) + ":   ");
         for (int c = 0; c < dimC; c++) {
            System.out.print(matriz[f][c] + "   |   ");
         }
         System.out.println();
      }

      //Suma de los numero de la fila 1:
      int sumaTotal = 0;
      for (int c = 0; c < dimC; c++) {
         sumaTotal += matriz[0][c];
      }
      System.out.println("La suma total de los numeros de la fila 1 es: " + sumaTotal);

      //Buscar un numero en la matriz
      int numeroX = 54;
      boolean encontre = false;
      int fila = 0, colum = 0;

      while((fila < dimF) && (!encontre)){
         colum = 0;

         while((colum < dimC) && (!encontre)){
            if(matriz[fila][colum] == numeroX){
               encontre = true;
            }else{
               colum++;
            }
         }
         fila++;
      }
      if(encontre){
         System.out.println("Numero " + numeroX + " Encontrado en la Fila " + (fila) + " y Columna " + (colum+1));
      }else{
         System.out.println("Numero no encontrado en la matriz");
      }

   }
}
