public class Funcion {
   private String titulo;
   private String fecha;
   private double hora;
   private int dimF;
   private int dimC;
   private Butaca sala[][];

   public Funcion(String titulo, String fecha, double hora, int dimF, int dimC){
      this.titulo = titulo;
      this.fecha = fecha;
      this.hora = hora;
      this.dimF = dimF;
      this.dimC = dimC;

      this.sala = new Butaca[dimF][dimC];
   }

   //Mostrar Tabla
   public String mostrarTabla(){
      String aux = "Mostrar tabla: \n ";
      for (int f = 0; f < this.dimF; f++) {
         aux += "Fila nro " + (f+1) + ": ";
         for (int c = 0; c < this.dimC; c++) {
            aux += "   Butaca " + (c+1) + " -> Contenido: " + sala[f][c];
         }
         aux += "\n ";
      }

      return aux;
   }

   //Metodo get
   public String getTitulo() {
      return titulo;
   }
   public String getFecha() {
      return fecha;
   }
   public double getHora() {
      return hora;
   }
   public int getDimF() {
      return dimF;
   }
   public int getDimC() {
      return dimC;
   }

   //Metodo set
   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }
   public void setFecha(String fecha) {
      this.fecha = fecha;
   }
   public void setHora(double hora) {
      this.hora = hora;
   }
   public void setDimF(int dimF) {
      this.dimF = dimF;
   }
   public void setDimC(int dimC) {
      this.dimC = dimC;
   }

}
