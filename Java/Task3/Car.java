package Java.Task3;

public class Car {
   private String mark;
   private int year;
   private int price;

   public Car(){}; //Contructor vacio
   
   public Car(String mark, int year, int price){
      this.mark = mark;
      this.year = year;
      this.price = price;
   }

   //Metodos GETTERS
   public String getMark() {
      return mark;
   }
   public int getYear() {
      return year;
   }
   public int getPrice() {
      return price;
   }

   //Metodos SETTERS
   public void setMark(String mark) {
      this.mark = mark;
   }
   public void setYear(int year) {
      this.year = year;
   }
   public void setPrice(int price) {
      this.price = price;
   }
}
