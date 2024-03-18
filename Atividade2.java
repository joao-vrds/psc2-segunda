/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;

/**
 *
 * @author Jovro
 */
//Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina? Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, quando abastecido com etanol, logo, só vale a pena abastecer com ele se o valor estiver abaixo de setenta por cento do valor da gasolina. Para auxiliar motoristas a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis, e informe qual deve ser a escolha, com base no custo.
import java.util.Scanner;
public class Atividade2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double precoGasolina = 0;
        double precoEtanol = 0;
        double percentual;
        
        System.out.print("Digite o valor da gasolina: ");
        precoGasolina = input.nextDouble();
        
        System.out.print("Digite o valor do etanol: ");
        precoEtanol = input.nextDouble();
        
        percentual = (precoEtanol * 100)/ precoGasolina;
        
        if(percentual < 60)
        { System.out.print("É recomendável que se use etanol."); }
        else
        { System.out.print("É recomendável que se use gasolina."); }
        
        input.close();
    }
}
