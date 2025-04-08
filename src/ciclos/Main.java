/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author Biblioteca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            boolean exit = true;
       double N1 = -1, N2 = -1, N3 = -1;
       while(exit)  {
               Scanner lectura = new Scanner (System.in);
               
               System.out.println("MENU PRINCIPAL: \n 1. Digitar nota1 \n 2. Digitar nota2 \n 3. Digitar nota3 \n 4. Digitar nota final \n 5. Salir \n");
               System.out.println("DIGITA UNA OPCION: ");
               
               int opcion = lectura.nextInt();
               
               switch(opcion) {
                  case 1:
                    System.out.print("Ingrese Nota 1: ");
                    N1 = lectura.nextDouble();
                    break;
                case 2:
                    System.out.print("Ingrese Nota 2: ");
                    N2 = lectura.nextDouble();
                    break;
                case 3:
                    System.out.print("Ingrese Nota 3: ");
                    N3 = lectura.nextDouble();
                    break;
                case 4:
                    double notaFinal = (N1 + N2 + N3) / 3;
                    System.out.println("La Nota Final es: " + notaFinal);
                    break;
                case 5:
                    exit = false;
                    System.out.println("chao...");
                    break; 
                   }
               }
        }      
       
    
    }
    

    
    

