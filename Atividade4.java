/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade4;

/**
 *
 * @author Jovro
 */
//Crie um programa para calcular a regra de três.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade4
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0,00");
        
        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;
        double regra3 = 0;
        
        System.out.print("Digite o valor da primeira posição: ");
        valor1 = input.nextDouble();
        
        System.out.print("Digite o valor da segunda posição: ");
        valor2 = input.nextDouble();
        
        System.out.print("Digite o valor da terceira posição: ");
        valor3 = input.nextDouble();
        
        regra3 = (valor1 * valor3) / valor2;
        
        System.out.print("O valor de X é: " +  regra3);
        
        input.close();
    }
}
