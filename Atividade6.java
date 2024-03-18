/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade6;

/**
 *
 * @author Jovro
 */
//Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra. A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica escolhida. Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade6
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0,00");
        
        double larguraDaArea = 0;
        double comprimentoDaArea = 0;
        double larguraDaCeramica = 0;
        double comprimentoDaCeramica = 0;
        
        System.out.print("Digite o valor da largura do local em cm: ");
        larguraDaArea = input.nextDouble();
        
        System.out.print("Digite o valor do comprimento do local em cm: ");
        comprimentoDaArea = input.nextDouble();
        
        System.out.print("Digite o valor da largura da cerâmica em cm: ");
        larguraDaCeramica = input.nextDouble();
        
        System.out.print("Digite o valor do comprimnto da cerâmica em cm: ");
        comprimentoDaCeramica = input.nextDouble();
        
        
        double area = (larguraDaArea * comprimentoDaArea) ;
        double areaDaCeramica = larguraDaCeramica * comprimentoDaCeramica;
        double quantidadeDeCeramica = (area / areaDaCeramica)* 1.10;
        
        System.out.print("Você terá de comprar " + quantidadeDeCeramica + " peças");
        
        input.close();
    }
}
