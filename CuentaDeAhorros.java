
/**
 * Write a description of class CuentaDeAhorros here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import  java.lang.Math;
import java.util.Scanner;
public class CuentaDeAhorros
{
    
    
  
        

    
    public static void main(String args[])
    {
        double saldo1 = 200000;
        double saldo2 = 300000;
        double tasaInteres1 = 0.04;
        double tasaInteres2 = 0.05;
        double interesMes = 0;
        double saldoMes = 0;
    
        double deposito = 0;
        double retiro = 0;
        
        int seleccionarCuenta = 0;
        int queHacer = 0;
        int salirOp = 1;
        int salir = 1;
        int out = 0;
       
       Scanner lector=new Scanner(System.in);
       System.out.print("\f");
       
       System.out.println("Bienvenido al Sistema del Banco Tripitrapo, \nseleccione el producto que desea consultar:  \n"); 
       
       System.out.println("1. Cuenta de ahorros 1");
       System.out.println("2. Cuenta de ahorros 2");
       System.out.println("3. Salir");
       System.out.println("Ingrese su opción: ");
       seleccionarCuenta = lector.nextInt();
       do
       {
       if (seleccionarCuenta == 1)
       {
           
           do {
           System.out.println("\nQue desea hacer con su producto: ");
           System.out.println("1. Deposito");
           System.out.println("2. Retiro");
           System.out.println("3. Rendimiento de intereses los proximos 12 meses");
           System.out.println("4. Salir");
           System.out.println("Ingrese su opción: ");
           queHacer = lector.nextInt();
           if (queHacer == 1)
               {
               System.out.println("\nCuanto deseas depositar?: ");
               deposito = lector.nextDouble();
               
               saldo1 = saldo1 + deposito;
               
               System.out.println("\nSu nuevo saldo es: " + saldo1);
                             
               break;
               }
            else if(queHacer == 2)
               {
               System.out.println("\nCuanto deseas retirar?: ");
               retiro = lector.nextDouble();
               if (saldo1 > 0 && retiro < saldo1)
               {
                   saldo1 = saldo1 - retiro;
                   System.out.println("\nSu nuevo saldo es: " + saldo1);
               }
               else
               {
                 System.out.println("\nSu saldo es insuficiente para realizar esta transacción");  
                }
               
                             
               break; 
               }
           else if(queHacer == 3)
               {
               
               System.out.println("\nEl rendimiento de interese en su cuenta para los proximos 12 meses será el siguiente: ");
               int numeroMes = 1;
               saldoMes = saldo1;
               do
               {
                   System.out.println("\nMes "+ numeroMes + " : ");
                   interesMes = saldoMes * tasaInteres1; 
                   saldoMes = saldoMes + interesMes;
                   System.out.println(+ saldoMes);
                   numeroMes ++;
               }
               while (numeroMes<13);               
                                        
               break;    
               }
           else if (queHacer == 4)
           {
               System.exit(0);
            }
           else
           {
             System.out.println("Opción no valida\n");               
           }           
           }
           while (queHacer != 4);
       }
       if (seleccionarCuenta == 2)
       {
           
           System.out.println("\nQue desea hacer con su producto: ");
           System.out.println("1. Deposito");
           System.out.println("2. Retiro");
           System.out.println("3. Rendimiento de intereses los proximos 12 meses");
           System.out.println("4. Salir");
           System.out.println("Ingrese su opción: ");
           queHacer = lector.nextInt();
           do
           {
           if (queHacer == 1)
               {
               System.out.println("\nCuanto deseas depositar?: ");
               deposito = lector.nextDouble();
               
               saldo2 = saldo2 + deposito;
               
               System.out.println("\nSu nuevo saldo es: " + saldo2);
                             
               break;
               }
            else if(queHacer == 2)
               {
               System.out.println("\nCuanto deseas retirar?: ");
               retiro = lector.nextDouble();
               if (saldo2 > 0 && retiro < saldo2)
               {
                   saldo2 = saldo2 - retiro;
                   System.out.println("\nSu nuevo saldo es: " + saldo2);
               }
               else
               {
                 System.out.println("\nSu saldo es insuficiente para realizar esta transacción");  
                }
               
                             
               break; 
               }
           else if(queHacer == 3)
               {
               
               System.out.println("\nEl rendimiento de interese en su cuenta para los proximos 12 meses será el siguiente: ");
               int numeroMes = 1;
               saldoMes = saldo2;
               do
               {
                   System.out.println("\nMes "+ numeroMes + " : ");
                   interesMes = saldoMes * tasaInteres2; 
                   saldoMes = saldoMes + interesMes;
                   System.out.println(+ saldoMes);
                   numeroMes ++;
               }
               while (numeroMes<13);               
                                        
               break;    
               }
               else if (queHacer == 4)
           {
               System.exit(0);
            }
           else
               {
                System.out.println("Opción no valida\n");
                
               }           
           }
           while (queHacer != 4);
       
        }
        
        else if (seleccionarCuenta == 3)
           {
               System.exit(0);
            }
            
            else
               {
                System.out.println("Opción no valida\n");
                
               } 
    }
    while(seleccionarCuenta != 3);
}
}