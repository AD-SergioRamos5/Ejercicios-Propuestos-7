import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {
   public static void main(String[] args) 
   {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Introduce el nombre del fichero binario: ");
      String fichero = entrada.nextLine();
      
      final int BYTE1 = (int)'G';
      final int BYTE2 = (int)'I';
      final int BYTE3 = (int)'F';
      try 
      {
         FileInputStream ficheroEntrada2 = new FileInputStream(new File(fichero));
         
         int dato1 =ficheroEntrada2.read();
         int dato2 = ficheroEntrada2.read();
         int dato3 =ficheroEntrada2.read();
         
         if(dato1 == BYTE1 && dato2 == BYTE2 && dato3 == BYTE3)
         {
            System.out.print("Si es un GIF.");            
         }              
         else
            System.out.println("No es un GIF");
                        
         ficheroEntrada2.close();        
         
      } 
      catch (Exception e) 
      {
         System.out.println( "Ha habido problemas: " + e.getMessage() );
      }
      
   }
}