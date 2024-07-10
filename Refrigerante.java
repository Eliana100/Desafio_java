public class Refrigerante {
     static void metodoStatico(){
         System.out.println("Método statico");
     }
     public void metodoPublico(){
         System.out.println("Método público");
     }
     public static void main(String[]args) {
         metodoStatico();
         Refrigerante refri = new Refrigerante();
      refri.metodoPublico();
     }
}



