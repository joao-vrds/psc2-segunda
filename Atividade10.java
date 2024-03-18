/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade10;

/**
 *
 * @author Jovro
 */
//A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso. Crie um algoritmo que recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade10
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0.00");
        
        double mlPorKg = 35;
        double kg = 0;
        double mlPorDia = 0;
        double litrosPorDia = 0;
        
        System.out.print("Digite seu peso em Kg: ");
        kg = input.nextDouble();
        
        mlPorDia = mlPorKg * kg;
        litrosPorDia = mlPorDia / 1000;
        
        System.out.print("Você deveria beber diariamente " + litrosPorDia + " litros de água.");
        
        input.close();
    }
}
