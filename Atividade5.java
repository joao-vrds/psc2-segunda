/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade5;

/**
 *
 * @author Jovro
 */
//Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. O resultado deve aparecer de maneira organizada e clara para a pessoa utilizadora.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade5
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0,00");
        
        double altura = 0;
        double comprimento = 0;
        double area;
        double perimetro;
        double diagonal; 
        System.out.print("Digite o valor da altura em cm: ");
        altura = input.nextDouble();
        
        System.out.print("Digite o valor do comprimento em cm: ");
        comprimento = input.nextDouble();
        
        area = altura * comprimento;
        perimetro = (2 * altura) + (2 * comprimento);
        diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(comprimento, 2));
        
        System.out.println("O valor da área é de " + area + " cm");
        System.out.println("O valor do perímetro é " + perimetro + " cm");
        System.out.println("O valor da diagonal é " + df.format(diagonal) + " cm");
        
        input.close();
    }
}
