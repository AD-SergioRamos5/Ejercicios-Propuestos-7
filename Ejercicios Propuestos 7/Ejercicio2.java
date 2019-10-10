import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {
   public static void main(String[] args) 
   {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Introduce el nombre del fichero binario: ");
      String fichero = entrada.nextLine();
      
      try 
      {
         FileInputStream ficheroEntrada2 = new FileInputStream(new File(fichero));
         int dato = ficheroEntrada2.read();
        
         while(dato != -1)
         {
            if(dato >= 32 && dato <= 126)
               System.out.print((char)dato);
            dato = ficheroEntrada2.read();
         }
                        
         ficheroEntrada2.close();
      } 
      catch (Exception e) 
      {
         System.out.println( "Ha habido problemas: " + e.getMessage() );
      }
   }
}