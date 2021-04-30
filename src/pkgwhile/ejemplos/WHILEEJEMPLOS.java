/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Campe
 */
public class WHILEEJEMPLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Factorial();
        Ejercicio2();
        Ejercicio3();
    }
    public static void Factorial(){
        System.out.println("-------EJERCICIO 1------------");
        int factorial =1;
        int numero=0;
        Scanner Leer = new Scanner(System.in);
        System.out.println("INGRESE UN VALOR:");
        numero= Leer.nextInt();
        while (numero !=0) {
            factorial = factorial * numero;
            numero= numero-1;
        }
        System.out.println("EL FACTORIAL ES:" + factorial);
    }
    public static void Ejercicio2(){
        System.out.println("-----EJERCICIO 2------");
        int Num=1;
        int media;
        double suma=0;
        Scanner Leer = new Scanner(System.in);
        while (Num<=5) {
          System.out.println("INGRESE EL VALOR:" + Num);
        media = Leer.nextInt();
        Num++;
        suma+=media;  
        }
        System.out.println("LA MEDIA ES: " + (suma/5));
    }
    public static void Ejercicio3(){
       
       
        Scanner Leer = new Scanner(System.in);
        int n;
        double nota, suma = 0, mayor, menor;;
        System.out.println("-------------------EJERCICIO 3-------------------");
        do {
            System.out.print("INTRODUCE LA CANTIDAD DE NUMEROS: ");
            n = Leer.nextInt();  
        } while (n <= 0); 
        System.out.print("NUMERO 1: ");
        nota = Leer.nextDouble();
        suma = suma + nota; 
        mayor = nota; 
        menor = nota;
        for (int i = 2; i <= n; i++) {         
            System.out.print("NUMERO " + i + ": ");
            nota = Leer.nextDouble();
            suma = suma + nota;
            if (nota > mayor){ 
                mayor = nota;
            } else if (nota < menor) {
                menor = nota;
            }
        }
        System.out.println("LA SUMA ES: " + suma);
        System.out.println("EL PROMEDIO ES:" + suma/n);
        System.out.println("EL NUMERO MAYOR ES: " + mayor);
        System.out.println("EL NUMERO MENOR ES: " + menor);
        System.out.println("LA DISTANCIA ES:" + n);
        
    }
}
