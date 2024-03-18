/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade13;

/**
 *
 * @author Jovro
 */
//Escreva um programa que seja capaz de realizar a soma de duas frações, não é necessário simplificar. As entradas serão o numerador e, o denominador da primeira fração, seguidos do numerador e, o denominador da segunda fração. O resultado também deverá ser exibido em formato de fração. e.g: ⅗
import java.util.Scanner;
import java.text.DecimalFormat;


public class Atividade13
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0.00");
    
        double numerador1 = 0;
        double denominador1 = 0;
        double numerador2 = 0;
        double denominador2 = 0;
        double resultado1 = 0;
        double resultado2 = 0;
        
        System.out.print("Digite o primeiro númerador: ");
        numerador1 = input.nextDouble();
        System.out.print("Digite o primeiro denominador: ");
        denominador1 = input.nextDouble();
        System.out.print("Digite o segundo númerador: ");
        numerador2 = input.nextDouble();
        System.out.print("Digite o segundo denominador: ");
        denominador2 = input.nextDouble();
        
        if (denominador1 == denominador2) { 
            resultado1 = numerador1 + numerador2;
            resultado2 = denominador1;
         }
        
        else {
        resultado1 = ((numerador1 * denominador2) + (denominador1 * numerador1));
        resultado2 = denominador1 * denominador2;
        }
        
        System.out.print("O resultado da soma das frações é " + (int)resultado1 + "/" + (int)resultado2);
        
        input.close();
    }
}
