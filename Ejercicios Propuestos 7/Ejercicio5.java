import java.io.*;
import java.util.*;

public class Ejercicio5 {
   public static void main(String[] args) 
   {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Introduce el nombre del fichero binario: ");
      String fichero = entrada.nextLine();
      
      try 
      {
         FileInputStream ficheroEntrada2 = new FileInputStream(new File(fichero));
         int dato = ficheroEntrada2.read();
         
         System.out.print("Introduce una palabra para buscarla en el fichero: ");
         String palabra = entrada.nextLine();
         
         byte[] palabraByte = palabra.getBytes();
         
         int contador = 0;
         while(dato != -1)
         {
            if(dato == palabraByte[contador])
               contador++;
            else
               contador = 0;
               
            if(contador == palabraByte.length)
            {
               System.out.print("Palabra encontrada.");
               break;               
            }
            dato = ficheroEntrada2.read();
         }
         
         if(contador == 0)
            System.out.print("Palabra no encontrada.");
                               
         ficheroEntrada2.close();
      } 
      catch (Exception e) 
      {
         System.out.println( "Ha habido problemas: " + e.getMessage() );
      }
      
   }
}