/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade8;

/**
 *
 * @author Jovro
 */
//Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. Deve-se informar o tamanho do arquivo em MB, a velocidade do link em Mbps e, retornar o tempo total em minutos.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade8
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0.00");
        
        double tamanhoArquivo = 0;
        double velocidadeSegundos = 0;
        double velocidadeMinutos = 0;
        double tempo = 0;
        
        System.out.print("Digite a o tamanho do arquivo em MB: ");
        tamanhoArquivo = input.nextDouble();
        
        System.out.print("Digite a velocidade da internet em Mbps: ");
        velocidadeSegundos = input.nextDouble();
        
        velocidadeMinutos = 60 * velocidadeSegundos;
        tempo = tamanhoArquivo / velocidadeMinutos;
        
        System.out.print("O arquivo de " + tamanhoArquivo + "Mb será baixado em " + df.format(tempo) + " minutos.");
        
        input.close();
    }
}
