/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade11;

/**
 *
 * @author Jovro
 */
//Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, e o valor do KW/h. O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade11
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0.00");
        
        double potenciaAparelho = 0;
        double quantidadeDeHoras = 0;
        double quantidadeDeMinutos = 0;
        double valorKWh = 0;
        
        System.out.print("Digite o valor da potência do aparelho em Watts: ");
        potenciaAparelho = input.nextDouble();
        
        System.out.print("Digite a quantidade de minutos utilizados por dia: ");
        quantidadeDeMinutos = input.nextDouble();
        
        quantidadeDeHoras = quantidadeDeMinutos / 60;
        
        valorKWh = potenciaAparelho * quantidadeDeHoras / 1000;
        
        System.out.print("O equipamento consumiu " + valorKWh + " KW/h");
        
        input.close();
    }
}
