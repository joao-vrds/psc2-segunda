/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade12;

/**
 *
 * @author Jovro
 */
//Pesquise o valor aproximado de dias por mês e ajuste o programa anterior para exibir o custo mensal em energia elétrica com o equipamento inserido.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade12
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0.00");
        
        double potenciaAparelho = 0;
        double quantidadeDeHoras = 0;
        double quantidadeDeMinutos = 0;
        double valorKWh = 0;
        double quantidadeKWh = 0;
        double quantidadeDias = 0;
        double valorTotal = 0;
        
        System.out.print("Digite o valor da potência do aparelho em Watts: ");
        potenciaAparelho = input.nextDouble();
        
        System.out.print("Digite a quantidade de minutos utilizados por dia: ");
        quantidadeDeMinutos = input.nextDouble();
        
        System.out.print("Digite o valor do KW/h: ");
        valorKWh = input.nextDouble();
        
        System.out.print("Digite a quantidade média de dias em que o aparelho é utilizado no mês: ");
        quantidadeDias = input.nextDouble();
        
        quantidadeDeHoras = quantidadeDeMinutos / 60;
        quantidadeKWh = potenciaAparelho * quantidadeDeHoras / 1000;
        valorTotal = quantidadeDias * quantidadeKWh * valorKWh;
        
        System.out.print("O equipamento consumiu " + df.format(quantidadeKWh) + " KW/h e o valor a ser pago no mês é de R$" + df.format(valorTotal));
        
        input.close();
    }
}