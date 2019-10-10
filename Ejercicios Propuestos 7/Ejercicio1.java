import java.io.*;
public class Ejercicio1 {
   public static void main(String[] args) 
   {
      final int BYTE1 = 0x4D;
      final int BYTE2 = 0x5A;
      try 
      {
         FileInputStream ficheroEntrada2 = new FileInputStream(new File("write.exe"));
         int dato = ficheroEntrada2.read();
         int dato2 = ficheroEntrada2.read();
         
         if(dato == BYTE1 && dato2 == BYTE2 )
            System.out.println("Si es un EXE");
         else   
            System.out.println("No es un EXE.");
            
         ficheroEntrada2.close();
      } 
      catch (Exception e) 
      {
         System.out.println( "Ha habido problemas: " + e.getMessage() );
      }
   }
}