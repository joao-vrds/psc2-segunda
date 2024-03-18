/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade9;

/**
 *
 * @author Jovro
 */
//Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura, em centímetros, e exibir o peso ideal e o peso ideal ajustado. Dica: https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal Utilize este como referência para seus testes. Obs. O IMC é apenas uma referência, um médico deve ser consultado para entender as necessidades de cada indivíduo.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade9
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0.00");
        
        double altura = 0;
        double peso = 0;
        double imc = 0;
        
        System.out.print("Digite o a altura em centímetros: ");
        altura = input.nextDouble();
        
        System.out.print("Digite o peso em quilogramas: ");
        peso = input.nextDouble();
        
        imc = peso / ((altura / 100 )  * ( altura / 100));
        
        if( imc <= 18.5 )
        { System.out.print("Você está baixo do peso ideal."); }
        else if ( imc <= 24.9 )
        { System.out.print("Você está no peso ideal. Parabéns!!!"); }
        else if ( imc <= 29.9 )
        { System.out.print("Você está levemente acima do peso."); }
        else if ( imc <= 34.9 )
        { System.out.print("Você está com obesidade grau 1"); }
        else if ( imc <= 39.9 )
        { System.out.print("Você está com obesidade grau 2"); }
        else 
        { System.out.print("Você está com obesidade grau 3"); }
        
        input.close();
    }
}
