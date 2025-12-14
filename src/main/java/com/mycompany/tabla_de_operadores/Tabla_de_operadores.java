
package com.mycompany.tabla_de_operadores;
import java.util.Scanner;  //esta libreria nos permite escribir en la consola

public class Tabla_de_operadores {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("ingresa operador (+ - * /)");
        String operador = sc.nextLine();
        System.out.print("ingresa numero: ");
        int numero = sc.nextInt();
        System.out.print("ingresa numero desde: ");
        int desde = sc.nextInt();
        System.out.print("ingresa numero hasta: ");
        int hasta = sc.nextInt();
        System.out.println("tabla de " + operador);
        switch (operador){
            case "+":
                for (int i = desde; i <= hasta; i++){
                    System.out.println(i + " + " +  numero  + " = " + (i + numero));
                }break;
            case "-":
                for (int i = desde; i <= hasta; i++){
                    System.out.println(i + " - " +  numero  + " = " + (i - numero));
                }break;
            case "*":
                for (int i = desde; i <= hasta; i++){
                    System.out.println(i + " * " +  numero  + " = " + (i * numero));
                }break;
         case "/":
    if (numero == 0) {
        System.out.println("No se puede dividir entre 0");
        break;
    }

    for (int i = desde; i <= hasta; i++) {
        System.out.println(
            i + " / " + numero + " = " + ((double) i / numero)
        );
    }
    break;
         default:
             System.out.println("operador incorrecto ingresa el operador correcto (+ - * /)");
         } 
        sc.close();
       }   
}

