/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1_u2;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenU1_U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingresa el nombre del primer instrumento ");
         String I1 = scanner.nextLine();
        
        System.out.println("Ingresa el precio de compra del primer instrumento");
        double P1 = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Ingresa el nombre del segundo instrumento");
         String I2 = scanner.nextLine();
        
         System.out.println("Ingresa el precio de compra del segundo instrumento");
         double P2 = scanner.nextDouble();
         
         scanner.nextLine();

        System.out.println("Ingresa el nombre del tercer instrumento");
         String I3 = scanner.nextLine();
         
        System.out.println("Ingresa el precio de compra del tercer instrumento");
        double P3 = scanner.nextDouble();
              
      double Producto1G = (1250.45-P1);
              
      double Producto2G = (3743-P2);
              
      double Producto3G = (2683.78-P3);
      scanner.close();
      
      double Producto1GP = (Producto1G/P1)*100 ;
      double Producto2GP = (Producto2G/P2)*100 ;
      double Producto3GP = (Producto1G/P3)*100 ;
      
      
      System.out.println("El porcentaje de ganancia de "+I1+" es de "+ Producto1GP +"%");
      System.out.println("El porcentaje de ganancia de "+I2+" es de "+ Producto2GP +"%");
      System.out.println("El porcentaje de ganancia de "+I3+" es de "+ Producto3GP +"%");
      
      
      

    }
    
}
  
 
         

    
    
        // TODO code application logic here
   
