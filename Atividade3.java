/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade3;

/**
 *
 * @author Jovro
 */
//Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a2+b2 
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade3
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0,00");
        
        double a = 0;
        double b = 0;
        double c = 0;
        
        System.out.print("Digite o valor de A: ");
        a = input.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        b = input.nextDouble();
        
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.print("O valor da função de pitágoras é de " + df.format(c));
        
        input.close();
    }
}
