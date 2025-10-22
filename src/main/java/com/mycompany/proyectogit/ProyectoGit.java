
package com.mycompany.proyectogit;
import java.util.Scanner;

public class ProyectoGit {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner (System.in);        
        int a,b;
        
        System.out.println("Ingresa el valor de a:");
        a = ingreso.nextInt();
        System.out.println("Ingresa el valor de b:");
        b = ingreso.nextInt();
        System.out.println("La suma es:"+(a+b));
        
        
    }
}
