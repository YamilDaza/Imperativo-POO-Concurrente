package Java.Task5;

public class Main {
   public static void main(String[] args){
      int dimF = 5, dimC = 4;
      int [][] edificio = new int[dimF][dimC];

      /* int numero = (int) (Math.random() * n) + 1; Pedir numeros aleatorios donde N es el valor maximo o limite que queremos que nos retorne*/
      
      int piso = (int)(Math.random() * 5) + 1;
      int oficina = (int)(Math.random() * 3) + 1;
      System.out.println("PISO: " + piso);
      System.out.println("OFICINA: " + oficina);

      while(piso != 6){
         Persona unaPersona = new Persona(piso, oficina);
         System.out.println(unaPersona.toString());

         edificio[piso][oficina] = edificio[piso][oficina] + 1;
         
         piso = (int)(Math.random() * 5) + 1;
         oficina = (int)(Math.random() * 3) + 1;
      }

      for (int f = 0; f < dimF; f++) {
         System.out.println("Piso nro " + (f+1) + ": ");
         for (int c = 0; c < dimC; c++) {
            System.out.println("  - En la oficina " + (c+1) + " Asistieron: " + edificio[f][c]);
         }
         System.out.println();
      }

   }
}
